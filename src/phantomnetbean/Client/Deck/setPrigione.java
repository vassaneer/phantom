package phantomnetbean.Client.Deck;

import phantomnetbean.Client.ActionCard.ActionCard;
import phantomnetbean.Client.ActionCard.prigione;
import phantomnetbean.Client.Card.Card;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class setPrigione {
    private ArrayList<Pair<Card, ActionCard>> deck = new ArrayList<>();
    public setPrigione(){
        deck.add(new Pair<Card,ActionCard>(new Card(4, Card.Suit.HEARTS,Card.Value.FOUR),new prigione()));
        deck.add(new Pair<Card,ActionCard>(new Card(10, Card.Suit.SPADES,Card.Value.TEN),new prigione()));
        deck.add(new Pair<Card,ActionCard>(new Card(10, Card.Suit.SPADES,Card.Value.JACK),new prigione()));
    }
    public  ArrayList<Pair<Card, ActionCard>> getdeck(){
        return deck;
    }
}
