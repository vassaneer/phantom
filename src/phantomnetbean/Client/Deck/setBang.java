package phantomnetbean.Client.Deck;

import phantomnetbean.Client.ActionCard.ActionCard;
import phantomnetbean.Client.ActionCard.bang;
import phantomnetbean.Client.Card.Card;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class setBang {
    private ArrayList<Pair<Card, ActionCard>> deck = new ArrayList<>();
    public setBang(){
        deck.add(new Pair<Card,ActionCard>(new Card(1, Card.Suit.DIAMONDS,Card.Value.ACE),new bang()));
        deck.add(new Pair<Card,ActionCard>(new Card(1, Card.Suit.HEARTS,Card.Value.ACE),new bang()));
        deck.add(new Pair<Card,ActionCard>(new Card(1, Card.Suit.SPADES,Card.Value.ACE),new bang()));
        deck.add(new Pair<Card,ActionCard>(new Card(2, Card.Suit.CLUBS,Card.Value.TWO),new bang()));
        deck.add(new Pair<Card,ActionCard>(new Card(2, Card.Suit.DIAMONDS,Card.Value.TWO),new bang()));
        deck.add(new Pair<Card,ActionCard>(new Card(3, Card.Suit.CLUBS,Card.Value.THREE),new bang()));
        deck.add(new Pair<Card,ActionCard>(new Card(3, Card.Suit.DIAMONDS,Card.Value.THREE),new bang()));
        deck.add(new Pair<Card,ActionCard>(new Card(4, Card.Suit.CLUBS,Card.Value.FOUR),new bang()));
        deck.add(new Pair<Card,ActionCard>(new Card(4, Card.Suit.DIAMONDS,Card.Value.FOUR),new bang()));
        deck.add(new Pair<Card,ActionCard>(new Card(5, Card.Suit.CLUBS,Card.Value.FIVE),new bang()));
        deck.add(new Pair<Card,ActionCard>(new Card(5, Card.Suit.DIAMONDS,Card.Value.FIVE),new bang()));
        deck.add(new Pair<Card,ActionCard>(new Card(6, Card.Suit.CLUBS,Card.Value.SIX),new bang()));
        deck.add(new Pair<Card,ActionCard>(new Card(6, Card.Suit.DIAMONDS,Card.Value.SIX),new bang()));
        deck.add(new Pair<Card,ActionCard>(new Card(7, Card.Suit.CLUBS,Card.Value.SEVEN),new bang()));
        deck.add(new Pair<Card,ActionCard>(new Card(7, Card.Suit.DIAMONDS,Card.Value.SEVEN),new bang()));
        deck.add(new Pair<Card,ActionCard>(new Card(8, Card.Suit.CLUBS,Card.Value.EIGHT),new bang()));
        deck.add(new Pair<Card,ActionCard>(new Card(8, Card.Suit.DIAMONDS,Card.Value.EIGHT),new bang()));
        deck.add(new Pair<Card,ActionCard>(new Card(9, Card.Suit.CLUBS,Card.Value.NINE),new bang()));
        deck.add(new Pair<Card,ActionCard>(new Card(9, Card.Suit.DIAMONDS,Card.Value.NINE),new bang()));
        deck.add(new Pair<Card,ActionCard>(new Card(10, Card.Suit.DIAMONDS,Card.Value.TEN),new bang()));
        deck.add(new Pair<Card,ActionCard>(new Card(10, Card.Suit.DIAMONDS,Card.Value.JACK),new bang()));
        deck.add(new Pair<Card,ActionCard>(new Card(10, Card.Suit.DIAMONDS,Card.Value.QUEEN),new bang()));
        deck.add(new Pair<Card,ActionCard>(new Card(10, Card.Suit.HEARTS,Card.Value.QUEEN),new bang()));
        deck.add(new Pair<Card,ActionCard>(new Card(10, Card.Suit.DIAMONDS,Card.Value.KING),new bang()));
        deck.add(new Pair<Card,ActionCard>(new Card(10, Card.Suit.HEARTS,Card.Value.KING),new bang()));
    }
    public  ArrayList<Pair<Card, ActionCard>> getdeck(){
        return deck;
    }
}
