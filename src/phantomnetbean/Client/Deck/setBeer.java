package phantomnetbean.Client.Deck;

import phantomnetbean.Client.ActionCard.ActionCard;
import phantomnetbean.Client.ActionCard.beer;
import phantomnetbean.Client.Card.Card;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class setBeer {
    private ArrayList<Pair<Card, ActionCard>> deck = new ArrayList<>();
    public setBeer(){
        deck.add(new Pair<Card,ActionCard>(new Card(6, Card.Suit.HEARTS,Card.Value.SIX),new beer()));
        deck.add(new Pair<Card,ActionCard>(new Card(7, Card.Suit.HEARTS,Card.Value.SEVEN),new beer()));
        deck.add(new Pair<Card,ActionCard>(new Card(8, Card.Suit.HEARTS,Card.Value.EIGHT),new beer()));
        deck.add(new Pair<Card,ActionCard>(new Card(9, Card.Suit.HEARTS,Card.Value.NINE),new beer()));
        deck.add(new Pair<Card,ActionCard>(new Card(10, Card.Suit.HEARTS,Card.Value.TEN),new beer()));
        deck.add(new Pair<Card,ActionCard>(new Card(10, Card.Suit.HEARTS,Card.Value.JACK),new beer()));
    }
    public  ArrayList<Pair<Card, ActionCard>> getdeck(){
        return deck;
    }
}
