package phantomnetbean.Client.Deck;

import phantomnetbean.Client.ActionCard.ActionCard;
import phantomnetbean.Client.ActionCard.duel;
import phantomnetbean.Client.Card.Card;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class setDuel {
    private ArrayList<Pair<Card, ActionCard>> deck = new ArrayList<>();
    public setDuel(){
        deck.add(new Pair<Card,ActionCard>(new Card(8, Card.Suit.CLUBS,Card.Value.EIGHT),new duel()));
        deck.add(new Pair<Card,ActionCard>(new Card(10, Card.Suit.SPADES,Card.Value.JACK),new duel()));
        deck.add(new Pair<Card,ActionCard>(new Card(10, Card.Suit.DIAMONDS,Card.Value.QUEEN),new duel()));
    }
    public  ArrayList<Pair<Card, ActionCard>> getdeck(){
        return deck;
    }
}
