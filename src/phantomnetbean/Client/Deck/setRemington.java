package phantomnetbean.Client.Deck;

import phantomnetbean.Client.ActionCard.ActionCard;
import phantomnetbean.Client.ActionCard.remington;
import phantomnetbean.Client.Card.Card;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class setRemington {
    private ArrayList<Pair<Card, ActionCard>> deck = new ArrayList<>();
    public setRemington(){
        deck.add(new Pair<Card,ActionCard>(new Card(10, Card.Suit.CLUBS,Card.Value.KING),new remington()));
    }
    public  ArrayList<Pair<Card, ActionCard>> getdeck(){
        return deck;
    }
}
