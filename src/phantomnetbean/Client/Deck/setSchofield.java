package phantomnetbean.Client.Deck;

import phantomnetbean.Client.ActionCard.ActionCard;
import phantomnetbean.Client.ActionCard.schofield;
import phantomnetbean.Client.Card.Card;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class setSchofield {
    private ArrayList<Pair<Card, ActionCard>> deck = new ArrayList<>();
    public setSchofield(){
        deck.add(new Pair<Card,ActionCard>(new Card(10, Card.Suit.CLUBS,Card.Value.JACK),new schofield()));
        deck.add(new Pair<Card,ActionCard>(new Card(10, Card.Suit.CLUBS,Card.Value.QUEEN),new schofield()));
        deck.add(new Pair<Card,ActionCard>(new Card(10, Card.Suit.SPADES,Card.Value.KING),new schofield()));
    }
    public  ArrayList<Pair<Card, ActionCard>> getdeck(){
        return deck;
    }
}
