package phantomnetbean.Client.Personal;


import  phantomnetbean.Client.*;

import java.util.ArrayList;
import java.util.Arrays;


public class Characters {
    public enum Character{
        SLABTHEKILLER,WILLYTHEKID,SIDKETCHUM,ROSEDOOLAN,PAULREGRET
    }
    private final Character character;
    private  int hp;
    public  Characters (Character ch){
        character = ch;
        if(ch.ordinal()+1 <=14 ){
            hp = 4;
        }else{
            hp = 3;
        }
    }
    public int getLife(){
        return hp;
    }
    public Character getName(){
        return character;
    }
}