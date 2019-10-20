package phantomnetbean.Client.Deck;

import phantomnetbean.Client.ActionCard.ActionCard;
import phantomnetbean.Client.ActionCard.saloon;
import phantomnetbean.Client.Card.Card;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class setSaloon {
    private ArrayList<Pair<Card, ActionCard>> deck = new ArrayList<>();
    public setSaloon(){
        deck.add(new Pair<Card,ActionCard>(new Card(5, Card.Suit.HEARTS,Card.Value.FIVE),new saloon()));
    }
    public  ArrayList<Pair<Card, ActionCard>> getdeck(){
        return deck;
    }
}
