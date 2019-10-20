package phantomnetbean.Client.Deck;

import phantomnetbean.Client.ActionCard.ActionCard;
import phantomnetbean.Client.ActionCard.dodges;
import phantomnetbean.Client.Card.Card;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class setDodge {
    private ArrayList<Pair<Card, ActionCard>> deck = new ArrayList<>();
    public setDodge(){
        deck.add(new Pair<Card,ActionCard>(new Card(1, Card.Suit.CLUBS,Card.Value.ACE),new dodges()));
        deck.add(new Pair<Card,ActionCard>(new Card(2, Card.Suit.SPADES,Card.Value.TWO),new dodges()));
        deck.add(new Pair<Card,ActionCard>(new Card(3, Card.Suit.SPADES,Card.Value.THREE),new dodges()));
        deck.add(new Pair<Card,ActionCard>(new Card(4, Card.Suit.SPADES,Card.Value.FOUR),new dodges()));
        deck.add(new Pair<Card,ActionCard>(new Card(5, Card.Suit.SPADES,Card.Value.FIVE),new dodges()));
        deck.add(new Pair<Card,ActionCard>(new Card(6, Card.Suit.SPADES,Card.Value.SIX),new dodges()));
        deck.add(new Pair<Card,ActionCard>(new Card(7, Card.Suit.SPADES,Card.Value.SEVEN),new dodges()));
        deck.add(new Pair<Card,ActionCard>(new Card(8, Card.Suit.SPADES,Card.Value.EIGHT),new dodges()));
        deck.add(new Pair<Card,ActionCard>(new Card(10, Card.Suit.CLUBS,Card.Value.TEN),new dodges()));
        deck.add(new Pair<Card,ActionCard>(new Card(10, Card.Suit.CLUBS,Card.Value.JACK),new dodges()));
        deck.add(new Pair<Card,ActionCard>(new Card(10, Card.Suit.CLUBS,Card.Value.QUEEN),new dodges()));
        deck.add(new Pair<Card,ActionCard>(new Card(10, Card.Suit.CLUBS,Card.Value.KING),new dodges()));
    }
    public  ArrayList<Pair<Card, ActionCard>> getdeck(){
        return deck;
    }
}
