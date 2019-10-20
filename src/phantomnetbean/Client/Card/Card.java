package phantomnetbean.Client.Card;


public class Card implements java.io.Serializable{
    public enum Suit { // card suit
        HEARTS,SPADES,CLUBS,DIAMONDS
    }
    public enum Value { // card value
        ACE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING
    }
    private final Suit suit;
    private final Value value;
    private final int weight;
    public Card(int weight, Suit suit, Value value) {
        this.weight = weight;
        this.suit = suit;
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public Suit getSuit() {
        return suit;
    }

    public Value getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Card{" +
                "weight=" + weight+
                ", suit=" + suit +
                ", value=" + value +
                '}';
    }

}
