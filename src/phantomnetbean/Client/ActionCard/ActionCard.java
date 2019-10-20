package phantomnetbean.Client.ActionCard;

/*


*/


import  phantomnetbean.Client.Card.Card;
import phantomnetbean.Client.Deck.Deck;
import   phantomnetbean.Client.Personal.Player;
import javafx.util.Pair;

import java.util.*;



public class ActionCard implements java.io.Serializable {
    protected Deck deckOnfield;
    protected Player own;
    protected ArrayList<Player> allPlayer;
    protected boolean enable;


    public boolean dealCheck(){
        return false;
    }

    public void printcard (ArrayList<Pair<Card,ActionCard>> s){
        for(Pair<Card,ActionCard> a : s) System.out.println(s.indexOf(a)+1+": blank");
    }
    //element in card
    public ArrayList<Player> choose(String onRange){
        List<Player> temp = new ArrayList<Player>();
        if(allPlayer.indexOf(own)<2){
            temp.add(allPlayer.get(allPlayer.size()-2));
            temp.add(allPlayer.get(allPlayer.size()-1));
        }
        for (Player item : allPlayer) temp.add(item);
        if(allPlayer.indexOf(own)>2){
            temp.add(allPlayer.get(0));
            temp.add(allPlayer.get(1));
        }
        Set<Player> s = new HashSet<Player>();
        for(int i = 0 ; i < temp.size() ; i++){
            if(own == temp.get(i) && !onRange.equals("any")) continue;
            if(onRange.equals("one")) {
                if(Math.abs((i)-(temp.indexOf(own)))+(temp.get(i).getDistanceToMe()-own.getRange())<=1) s.add(temp.get(i));
            }else if(onRange.equals("inrange")){
                if(Math.abs((i)-(temp.indexOf(own)))+(temp.get(i).getDistanceToMe()-own.getRange())<=own.getRange()) s.add(temp.get(i));
            } else {
                s.add(temp.get(i));
            }
        }
        return new ArrayList<Player>(s);
    }

    //
    public void destructer(){System.out.println();};
    public ActionCard( ){ }
    public int select(){ return 0;}
    public void ability(){
        System.out.println("");
    }
    public void setAllPlayer(ArrayList<Player> s){
        allPlayer = s;
    }
    public boolean getEnable(){
        return enable;
    }
    public void take_own(Player myplayer){
        own = myplayer;
    }
    public void set_deck(Deck deck){
        deckOnfield = deck;
    }
    @Override
    public String toString() {
        return "";
    }
}




