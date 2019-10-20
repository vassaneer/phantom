package phantomnetbean.Client.Deck;

import phantomnetbean.Client.ActionCard.ActionCard;
import phantomnetbean.Client.ActionCard.indians;
import phantomnetbean.Client.Card.Card;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class setIndian {
    private ArrayList<Pair<Card, ActionCard>> deck = new ArrayList<>();
    public setIndian(){
        deck.add(new Pair<Card,ActionCard>(new Card(1, Card.Suit.SPADES,Card.Value.ACE),new indians()));
        deck.add(new Pair<Card,ActionCard>(new Card(10, Card.Suit.SPADES,Card.Value.KING),new indians()));
    }
    public  ArrayList<Pair<Card, ActionCard>> getdeck(){
        return deck;
    }
}
