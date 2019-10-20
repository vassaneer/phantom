package phantomnetbean.Client.ActionCard;

import phantomnetbean.Client.Card.Card;
import phantomnetbean.Client.Personal.Player;
import javafx.util.Pair;
import  phantomnetbean.Client.getInput;
public class prigione extends ActionCard implements NexusCard,passiveAction{
    public prigione(){
        super();
    }
    public void ability(){
    }
    public int select(){
        for(Player a : allPlayer){
            if(!a.equals(own) && !a.crucial()){
                System.out.println(allPlayer.indexOf(a)+1+": "+a.myCharacter);
            }
        }
        int b = new getInput().getA();
        return b-1;
    }
    @Override
    public String toString() {
        return "prione !!";
    }
}
