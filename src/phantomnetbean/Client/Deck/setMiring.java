package phantomnetbean.Client.Deck;

import phantomnetbean.Client.ActionCard.ActionCard;
import phantomnetbean.Client.ActionCard.miring;
import phantomnetbean.Client.Card.Card;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class setMiring {
    private ArrayList<Pair<Card, ActionCard>> deck = new ArrayList<>();
    public setMiring(){
        deck.add(new Pair<Card,ActionCard>(new Card(1, Card.Suit.SPADES,Card.Value.ACE),new miring()));
    }
    public  ArrayList<Pair<Card, ActionCard>> getdeck(){
        return deck;
    }
}
