/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phantomnetbean.Server;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.*;
import phantomnetbean.Client.Personal.Characters;
import phantomnetbean.Client.Personal.Role;
import phantomnetbean.Client.Personal.Player;
import phantomnetbean.Server.Server.ClientInfo;
import phantomnetbean.Server.GameState.*;
import phantomnetbean.Client.Deck.*;

/**
 *
 * @author Apichart
 */
public class GameControl extends Thread {
    
    /**
     * Creates a new instance of Server
     */
    private Deck deckOnfield;
    private Deck deckOnDead;
    protected ArrayList<Server.ClientInfo> clients;
    protected ServerSocket serverSocket;
    protected int serverPort=11111;

    //private DataInputStream reader;
    //private DataOutputStream writer;
    
    protected ObjectOutputStream writer;
    protected ObjectInputStream reader;
    
    protected Protocol protocol;
    protected boolean running=true;

    public GameControl(ServerSocket soc, ArrayList<Server.ClientInfo> client, ObjectOutputStream out,ObjectInputStream in)  throws SocketException{
        this.clients = client;
        this.reader = in;
        this.writer = out;
        this.serverSocket = soc;
        this.protocol = new Protocol();
        this.deckOnfield = new Deck();
        this.deckOnDead = new Deck("dead");
    } 
    public void run(){
        GameStates states =  GameStates.INITIAL;
        int cycle = 0;
        while(running) {
        if(states.equals(GameStates.INITIAL)){
        //set Role to all member
          ArrayList<String>  roles = new Role().Roles();
                    // give role card
                    String roleCard;
                    Collections.shuffle(roles);
                    for(ClientInfo a:clients){
                        roleCard = roles.remove(0);
                        a.sendObject(protocol.giveRole());
                        a.sendObject(new Role(roleCard));
                        a.getPlayerInfo().setRole(new Role (roleCard));
                    }
          //set Character to all member
          ArrayList<Characters.Character> chars = new ArrayList<Characters.Character>();
          for(Characters.Character a : Characters.Character.values()){
            chars.add(a);
        }
                       // give character card
                      Characters.Character charCard;
                      Collections.shuffle(chars);
                      for(ClientInfo a:clients){
                         charCard = chars.remove(0);
                        a.sendObject(protocol.giveCharacter());
                        a.sendObject(charCard);
                        a.getPlayerInfo().setCharacter(charCard);
                    }
          //build hand
         for(int count = 0 ; count<clients.size() ; count++){
             int lifeOfPlayer =clients.get(count).getPlayerInfo().getlife();
             while(lifeOfPlayer>0){
                 clients.get(count).sendObject(protocol.builHand());
                 clients.get(count).sendObject(this.deckOnfield.dealCard());
                 lifeOfPlayer--;
             }
         }
         states = GameState.GameStates.SELECTCYCLE;
    }else if(states == GameState.GameStates.SELECTCYCLE){
        for(ClientInfo a: clients){
            if(a.getPlayerInfo().crucial()) {
                a.sendObject(protocol.selectCycle());
            }
        }
        Socket clientSocket=null;
        while(true)
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
            System.out.println(sentence);
            if(sentence.startsWith("Select")){
                cycle = Integer.parseInt(sentence.substring(sentence.indexOf("|"),sentence.indexOf("|")+2));
                states = GameState.GameStates.STARTLOOP;
                break;
            }
        }
    }
    }
    }
    
    public void BroadCastMessage(Object mess) throws IOException
    {
        for(ClientInfo c:clients)
        {
            if(c!=null)
                c.getWriterStream().writeObject(mess);
        }
    }
}
