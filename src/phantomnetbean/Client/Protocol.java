package phantomnetbean.Client;
/*
 * Protocol.java
 *
 * Created on 25 ����, 2008, 10:32 �
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

import phantomnetbean.Client.Personal.Characters;
import phantomnetbean.Client.Personal.Role;

/**
 *
 * @author Mohamed Talaat Saad
 */
public class Protocol {


    /**
     * Creates a new instance of Protocol
     */
    private String message="";
    public Protocol()
    {

    }

    public String RegisterPacket(String name)
    {
        message="Hello"+"|"+name;
        return message;
    }
     public String ReadyPacket(int id)
    {
        message="Ready|"+id;
        return message;
    }
    public String ChooseCharacter(Characters.Character chooseChar, int id){
        message="Character"+chooseChar+"|"+id;
        return message;
    }
    public String ChooseRole(Role chooseRole, int id){
        message="Character"+chooseRole+"|"+id;
        return message;
    }
   public String SelectCycle(int select){
       message="Select|"+select;
       return message;
   }
    public String ExitMessagePacket(int id)
    {
        message="Exit"+id;
        return message;
    }
}
