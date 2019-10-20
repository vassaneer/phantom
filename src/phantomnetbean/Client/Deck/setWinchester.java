package phantomnetbean.Client.Deck;

import phantomnetbean.Client.ActionCard.ActionCard;
import phantomnetbean.Client.ActionCard.winchester;
import phantomnetbean.Client.Card.Card;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class setWinchester {
    private ArrayList<Pair<Card, ActionCard>> deck = new ArrayList<>();
    public setWinchester(){
        deck.add(new Pair<Card,ActionCard>(new Card(8, Card.Suit.SPADES,Card.Value.EIGHT),new winchester()));
    }
    public  ArrayList<Pair<Card, ActionCard>> getdeck(){
        return deck;
    }
}
