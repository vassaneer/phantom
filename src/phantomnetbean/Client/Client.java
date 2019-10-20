package phantomnetbean.Client;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.*;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
/*
 * Client.java
 *
 * Created on 21 ����, 2008, 09:23 �
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author Mohamed Talaat Saad
 */
public class Client {

    /**
     * Creates a new instance of Client
     */

    private Socket clientSocket;
    private String hostName;
    private int serverPort;
    private ObjectInputStream reader;
    private ObjectOutputStream  writer;
    private Protocol protocol;

    private static Client client;
    private Client() throws IOException
    {
        protocol=new Protocol();
    }

    public void register(String Ip ,String name) throws IOException{
        System.out.println(Ip);
        this.serverPort=11111;
        this.hostName=Ip;
        clientSocket=new Socket(Ip,11111);
        writer=new ObjectOutputStream (clientSocket.getOutputStream());
        
        writer.writeObject(protocol.RegisterPacket(name));


    }

      public void StartGame(int id)
    {
             sendToServer(protocol.ReadyPacket(id));
    }
    
    public void sendToServer(Object message)
    {
        if(message.equals("exit"))
            System.exit(0);
        else
        {
            try {
                Socket s=new Socket(hostName,serverPort);
                System.out.println(message);
                writer=new ObjectOutputStream (s.getOutputStream());
                writer.writeObject(message);
            } catch (IOException ex) {

            }
        }

    }

    public Socket getSocket()
    {
        return clientSocket;
    }
    public String getIP()
    {
        return hostName;
    }
    public static Client getGameClient()
    {
        if(client==null)

            try {
                client=new Client();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        return client;
    }
    public void closeAll()
    {
        try {
            reader.close();
            writer.close();
            clientSocket.close();
        } catch (IOException ex) {

        }
    }
}
