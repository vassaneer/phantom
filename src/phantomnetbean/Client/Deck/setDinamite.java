package phantomnetbean.Client.Deck;

import phantomnetbean.Client.ActionCard.ActionCard;
import phantomnetbean.Client.ActionCard.dinamite;
import phantomnetbean.Client.Card.Card;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class setDinamite {
    private ArrayList<Pair<Card, ActionCard>> deck = new ArrayList<>();
    public setDinamite(){
        deck.add(new Pair<Card,ActionCard>(new Card(2, Card.Suit.HEARTS,Card.Value.TWO),new dinamite()));
    }
    public  ArrayList<Pair<Card, ActionCard>> getdeck(){
        return deck;
    }
}
