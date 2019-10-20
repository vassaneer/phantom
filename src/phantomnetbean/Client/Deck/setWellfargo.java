package phantomnetbean.Client.Deck;

import phantomnetbean.Client.ActionCard.ActionCard;
import phantomnetbean.Client.ActionCard.wellsfargo;
import phantomnetbean.Client.Card.Card;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class setWellfargo {
    private ArrayList<Pair<Card, ActionCard>> deck = new ArrayList<>();
    public setWellfargo(){
        deck.add(new Pair<Card,ActionCard>(new Card(3, Card.Suit.HEARTS,Card.Value.THREE),new wellsfargo()));
    }
    public  ArrayList<Pair<Card, ActionCard>> getdeck(){
        return deck;
    }
}
