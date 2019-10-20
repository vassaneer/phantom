package  phantomnetbean.Server;
import phantomnetbean.Client.Client;
import phantomnetbean.Client.Deck.Deck;
import phantomnetbean.Client.Personal.Player;
import phantomnetbean.Client.Personal.Role;

import java.io.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import phantomnetbean.Client.ActionCard.*;
import phantomnetbean.Client.Card.Card;
import javafx.util.Pair;
import java.util.Collections;
/*
 * Server.java
 *
 * Created on 16/10/2019, 09:41 
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author Apichart Nutchanat
 */
public class Server extends Thread {

    /**
     * Creates a new instance of Server
     */

    protected ArrayList<ClientInfo> clients;
    protected ServerSocket serverSocket;
    protected int serverPort=11111;

    //private DataInputStream reader;
    //private DataOutputStream writer;
    
    protected ObjectOutputStream writer;
    protected ObjectInputStream reader;
    
    protected Protocol protocol;
    protected boolean running=true;


    public Server() throws SocketException
    {
        // array of client
        clients=new ArrayList<ClientInfo>();
        // create protocol
        protocol=new Protocol();
        try {
            // crate server from port 1111
            serverSocket=new ServerSocket(serverPort);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void run()
    {
        // socket of client
        Socket clientSocket=null;
        while(running)
        {
            try {
                // accept socket client
                clientSocket=serverSocket.accept();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            // sentence from client
            String sentence="";
            try {
                // read from client
                reader=new ObjectInputStream(clientSocket.getInputStream());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            try {
                // export sentence from client to server
                sentence=(String)reader.readObject();
            } catch (IOException | ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            // show sentence
            System.out.println(sentence);
            // if sertence start with hello
            if(sentence.startsWith("Hello")) 
            {
                try {
                    // create writer
                    writer=new ObjectOutputStream(clientSocket.getOutputStream());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                // send to client id package
                sendToClient(protocol.IDPacket(clients.size()+1));
                  // add new client
                clients.add(new ClientInfo(writer,sentence.substring(sentence.indexOf("|")+1) ,clientSocket));
                try {
                    // notification to other client
                    BroadCastMessage(protocol.NewClientPacket(clients.size()));
                    // notification to other client
                    sendAllClients(writer);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                initialgame(true);
            }
              else if(sentence.startsWith("Ready"))
            {
                int id=Integer.parseInt(sentence.substring(sentence.indexOf("|")+1));
                clients.get(id-1).setReady(true);
                initialgame(false);
            }
             else if(sentence.startsWith("Exit"))
            {
                int id=Integer.parseInt(sentence.substring(4));

//                try {
//                    BroadCastMessage(sentence);
//                } catch (IOException ex) {
//                    ex.printStackTrace();
//                }
                if(clients.get(id-1)!=null)
                    clients.remove(id-1);
            }
        }

//        try {
//            reader.close();
//            writer.close();
//            serverSocket.close();
//            clientSocket.close();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
    }
    
    
    public void initialgame (boolean check){
        boolean game = false;
        // number of client
         if(clients.size() == 5 && check )
            {
                  try {
                    BroadCastMessage(protocol.StartGamePacket());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }else{
             int i=0;
             String names = "";
             for(ClientInfo a:clients){
                if(a.getReady()) {
                    i++;
                    names+=a.getName()+",";
                }
            }
             // number of client
             if(i==5) {
                     try {
                    BroadCastMessage(protocol.GetNamePacket(names));
                    // start control
                    new GameControl(serverSocket,clients,writer,reader).start();
                    this.running = false;
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
             }
         }
    }
    
    
    public void stopServer() throws IOException
    {
        running=false;
    }

    public void BroadCastMessage(Object mess) throws IOException
    {
        for(ClientInfo c:clients)
        {
            if(c!=null)
                c.getWriterStream().writeObject(mess);
        }
    }
    public void sendToClient(Object message)
    {
        if(message.equals("exit"))
            System.exit(0);
        else
        {
            try {
                writer.writeObject(message);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void sendAllClients(ObjectOutputStream writer)
    {
        for(int i=0;i<clients.size();i++)
        {
            if(clients.get(i)!=null) {
                try {
                    writer.writeObject(protocol.NewClientPacket(i+1));
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public class ClientInfo{
         //private DataOutputStream writers;
         private String name;
         private boolean isReady;
         private ObjectOutputStream objectOutputStream ;
         private OutputStream outputStream ;
         private Player playerInfo;

        public ClientInfo(ObjectOutputStream writer,String name ,Socket soc)
        {
            this.isReady=false;
            //this.writers=writer;
            this.name=name;
            try{
            this.outputStream = soc.getOutputStream();
            this.objectOutputStream = writer;
            this.playerInfo = new Player();
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }

        public void sendObject(Object c){
          try {
               
               System.out.println(c.toString());
              objectOutputStream.writeObject(c);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
    }
        
        public ObjectOutputStream getWriterStream()
        {
            return this.objectOutputStream;
        }
        public String getName(){
        return this.name;
    }
        public boolean getReady(){
            return this.isReady;
        }
        public void setReady(boolean ready){
            this.isReady = ready;
        }
        public Player getPlayerInfo(){
            return this.playerInfo;
        }
    }

}
