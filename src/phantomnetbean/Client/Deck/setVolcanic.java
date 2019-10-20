package phantomnetbean.Client.Deck;

import phantomnetbean.Client.ActionCard.ActionCard;
import phantomnetbean.Client.ActionCard.volcanic;
import phantomnetbean.Client.Card.Card;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class setVolcanic {
    private ArrayList<Pair<Card, ActionCard>> deck = new ArrayList<>();
    public setVolcanic(){
        deck.add(new Pair<Card,ActionCard>(new Card(10, Card.Suit.CLUBS,Card.Value.TEN),new volcanic()));
        deck.add(new Pair<Card,ActionCard>(new Card(10, Card.Suit.SPADES,Card.Value.TEN),new volcanic()));
    }
    public  ArrayList<Pair<Card, ActionCard>> getdeck(){
        return deck;
    }
}
