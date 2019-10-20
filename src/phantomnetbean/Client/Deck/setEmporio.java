package phantomnetbean.Client.Deck;

import phantomnetbean.Client.ActionCard.ActionCard;
import phantomnetbean.Client.ActionCard.emporio;
import phantomnetbean.Client.Card.Card;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class setEmporio {
    private ArrayList<Pair<Card, ActionCard>> deck = new ArrayList<>();
    public setEmporio(){
        deck.add(new Pair<Card,ActionCard>(new Card(9, Card.Suit.CLUBS,Card.Value.NINE),new emporio()));
        deck.add(new Pair<Card,ActionCard>(new Card(10, Card.Suit.SPADES,Card.Value.QUEEN),new emporio()));
    }
    public  ArrayList<Pair<Card, ActionCard>> getdeck(){
        return deck;
    }
}
