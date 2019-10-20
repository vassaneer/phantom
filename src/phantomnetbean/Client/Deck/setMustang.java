package phantomnetbean.Client.Deck;

import phantomnetbean.Client.ActionCard.ActionCard;
import phantomnetbean.Client.ActionCard.mustang;
import phantomnetbean.Client.Card.Card;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class setMustang {
    private ArrayList<Pair<Card, ActionCard>> deck = new ArrayList<>();
    public setMustang(){
        deck.add(new Pair<Card,ActionCard>(new Card(8, Card.Suit.HEARTS,Card.Value.EIGHT),new mustang()));
        deck.add(new Pair<Card,ActionCard>(new Card(9, Card.Suit.HEARTS,Card.Value.NINE),new mustang()));
    }
    public  ArrayList<Pair<Card, ActionCard>> getdeck(){
        return deck;
    }
}
