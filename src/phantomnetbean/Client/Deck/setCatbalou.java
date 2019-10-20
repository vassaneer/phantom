package phantomnetbean.Client.Deck;

import phantomnetbean.Client.ActionCard.ActionCard;
import phantomnetbean.Client.ActionCard.catbalou;
import phantomnetbean.Client.Card.Card;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class setCatbalou {
    private ArrayList<Pair<Card, ActionCard>> deck = new ArrayList<>();
    public setCatbalou(){
        deck.add(new Pair<Card,ActionCard>(new Card(9, Card.Suit.DIAMONDS,Card.Value.NINE),new catbalou()));
        deck.add(new Pair<Card,ActionCard>(new Card(10, Card.Suit.DIAMONDS,Card.Value.TEN),new catbalou()));
        deck.add(new Pair<Card,ActionCard>(new Card(10, Card.Suit.DIAMONDS,Card.Value.JACK),new catbalou()));
    }
    public  ArrayList<Pair<Card, ActionCard>> getdeck(){
        return deck;
    }
}
