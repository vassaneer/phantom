package phantomnetbean.Client;
import phantomnetbean.Client.Personal.Player;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.net.Socket;
/*
 * InputManager.java
 *
 * Created on 25 ����, 2008, 02:57 �
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author Mohamed Talaat Saad
 */
public class InputManager implements KeyListener
{
    private final int LEFT = 37;
    private  final int RIGHT = 39;
    private final int UP = 38;
    private final int DOWN = 40;
    private static int status=0;

    private Player player;
    private Client client;
    /** Creates a new instance of InputManager */
    public InputManager(Player player)
    {
        this.client=Client.getGameClient();
        this.player=player;

    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e)
    {
    }

    public void keyReleased(KeyEvent e) {
    }

}
