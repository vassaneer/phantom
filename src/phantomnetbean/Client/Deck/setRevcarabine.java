package phantomnetbean.Client.Deck;

import phantomnetbean.Client.ActionCard.ActionCard;
import phantomnetbean.Client.ActionCard.revcarabine;
import phantomnetbean.Client.Card.Card;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class setRevcarabine {
    private ArrayList<Pair<Card, ActionCard>> deck = new ArrayList<>();
    public setRevcarabine(){
        deck.add(new Pair<Card,ActionCard>(new Card(1, Card.Suit.CLUBS,Card.Value.ACE),new revcarabine()));
    }
    public  ArrayList<Pair<Card, ActionCard>> getdeck(){
        return deck;
    }
}
