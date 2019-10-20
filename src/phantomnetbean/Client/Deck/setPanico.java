package phantomnetbean.Client.Deck;

import phantomnetbean.Client.ActionCard.ActionCard;
import phantomnetbean.Client.ActionCard.panico;
import phantomnetbean.Client.Card.Card;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class setPanico {
    private ArrayList<Pair<Card, ActionCard>> deck = new ArrayList<>();
    public setPanico(){
        deck.add(new Pair<Card,ActionCard>(new Card(1, Card.Suit.HEARTS,Card.Value.ACE),new panico()));
        deck.add(new Pair<Card,ActionCard>(new Card(8, Card.Suit.DIAMONDS,Card.Value.EIGHT),new panico()));
        deck.add(new Pair<Card,ActionCard>(new Card(10, Card.Suit.HEARTS,Card.Value.JACK),new panico()));
        deck.add(new Pair<Card,ActionCard>(new Card(10, Card.Suit.HEARTS,Card.Value.QUEEN),new panico()));
    }
    public  ArrayList<Pair<Card, ActionCard>> getdeck(){
        return deck;
    }
}
