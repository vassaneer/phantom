package phantomnetbean.Server;
/*
 * Protocol.java
 *
 * Created on 01 �����, 2008, 09:38 �
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

import phantomnetbean.Client.Personal.Characters;
import  phantomnetbean.Client.Personal.Role;

/**
 *
 * @author Mohamed Talaat Saad
 */
public class Protocol {

    private String message="";
    /** Creates a new instance of Protocol */
    public Protocol() {
    }

    public String IDPacket(int id)
    {
        message="ID"+id;
        return message;
    }
    public String NewClientPacket( int id)
    {
        message="NewClient"+"|"+id;
        return message;
    }
    public String StartGamePacket()
    {
        message="StartGame";
        return message;
    }
     public String GetNamePacket(String name)
    {
        message="Name|"+name;
        return message;
    }
    public String giveCharacter()
    {
        message="NewCharacter";
        return message;
    }
    public String giveRole()
    {
        message="NewRole";
        return message;
    }
     public String builHand()
    {
        message="BuildHand";
        return message;
    }
       public String selectCycle()
    {
        message="SelectCycle";
        return message;
    }
}
