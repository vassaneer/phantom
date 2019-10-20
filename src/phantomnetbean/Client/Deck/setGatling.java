package phantomnetbean.Client.Deck;

import phantomnetbean.Client.ActionCard.ActionCard;
import phantomnetbean.Client.ActionCard.gatling;
import phantomnetbean.Client.Card.Card;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class setGatling {
    private ArrayList<Pair<Card, ActionCard>> deck = new ArrayList<>();
    public setGatling(){
        deck.add(new Pair<Card,ActionCard>(new Card(10, Card.Suit.HEARTS,Card.Value.TEN),new gatling()));
    }
    public  ArrayList<Pair<Card, ActionCard>> getdeck(){
        return deck;
    }
}
