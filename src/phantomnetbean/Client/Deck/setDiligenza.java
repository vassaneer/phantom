package phantomnetbean.Client.Deck;

import phantomnetbean.Client.ActionCard.ActionCard;
import phantomnetbean.Client.ActionCard.diligenza;
import phantomnetbean.Client.Card.Card;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class setDiligenza {
    private ArrayList<Pair<Card, ActionCard>> deck = new ArrayList<>();
    public setDiligenza(){
        deck.add(new Pair<Card,ActionCard>(new Card(9, Card.Suit.SPADES,Card.Value.NINE),new diligenza()));
        deck.add(new Pair<Card,ActionCard>(new Card(9, Card.Suit.SPADES,Card.Value.NINE),new diligenza()));
    }
    public  ArrayList<Pair<Card, ActionCard>> getdeck(){
        return deck;
    }
}
