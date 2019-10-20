package phantomnetbean.Client.ActionCard;

import phantomnetbean.Client.Card.Card;
import phantomnetbean.Client.Personal.Player;
import  phantomnetbean.Client.getInput;
import javafx.util.Pair;

public class dinamite extends ActionCard implements NexusCard,passiveAction {
    public dinamite(){
        super();
    }
    public int select(){
        for(Player a : allPlayer){
            if(!a.equals(own)){
                System.out.println(allPlayer.indexOf(a)+1+": "+a.myCharacter);
            }
        }
        int b = new getInput().getA();
        return b-1;
    }
    public void ability(){ }
    @Override
    public String toString() {
        return "dinamite !!";
    }
}
