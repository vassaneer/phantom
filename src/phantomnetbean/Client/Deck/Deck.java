package   phantomnetbean.Client.Deck;

import phantomnetbean.Client.Personal.Player;
import phantomnetbean.Client.ActionCard.*;
import phantomnetbean.Client.Card.Card;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

    /**
     * Created by ddceliasr on 4/8/16.
     */public class Deck {
        private List<Card> deckOfCard = new ArrayList<>();
        private List<Pair<Card, ActionCard>> deckOfAction = new ArrayList<>();
        public Deck(String s){

        }
        public Deck(){
            deckOfAction.addAll(new setBang().getdeck());
            deckOfAction.addAll(new setBarile().getdeck());
            deckOfAction.addAll(new setBeer().getdeck());
            deckOfAction.addAll(new setCatbalou().getdeck());
            deckOfAction.addAll(new setDiligenza().getdeck());
            deckOfAction.addAll(new setDinamite().getdeck());
            deckOfAction.addAll(new setDodge().getdeck());
            deckOfAction.addAll(new setDuel().getdeck());
            deckOfAction.addAll(new setEmporio().getdeck());
            deckOfAction.addAll(new setGatling().getdeck());
            deckOfAction.addAll(new setIndian().getdeck());
            deckOfAction.addAll(new setMiring().getdeck());
            deckOfAction.addAll(new setPanico().getdeck());
            deckOfAction.addAll(new setPrigione().getdeck());
            deckOfAction.addAll(new setRemington().getdeck());
            deckOfAction.addAll(new setRevcarabine().getdeck());
            deckOfAction.addAll(new setSaloon().getdeck());
            deckOfAction.addAll(new setSchofield().getdeck());
            deckOfAction.addAll(new setVolcanic().getdeck());
            deckOfAction.addAll(new setWellfargo().getdeck());
            deckOfAction.addAll(new setWinchester().getdeck());
            shuffleDeck(3);
        }
        public Deck(int a , Deck deck) {
            for (Card.Suit suit : Card.Suit.values()) {
                for (Card.Value value : Card.Value.values()) {
                    int weight;
                    switch (value) {
                        case JACK:
                        case QUEEN:
                        case KING:
                            weight = 10;
                            break;
                        default:
                            weight = value.ordinal() + 1;
                    }
                    Card card = new Card(weight, suit, value);
                    deckOfCard.add(card);
                    deckOfAction.add(new Pair<Card,ActionCard>(card,new bang()));
                    deckOfAction.add(new Pair<Card,ActionCard>(card,new dodges()));
                    //deckOfAction.add(new Pair<Card,ActionCard>(card,new diligenza()));
                    //deckOfAction.add(new Pair<Card,ActionCard>(card,new catbalou()));
                    //deckOfAction.add(new Pair<Card,ActionCard>(card,new panico()));
                    //deckOfAction.add(new Pair<Card,ActionCard>(card,new beer()));
//                    deckOfAction.add(new Pair<Card,ActionCard>(card,new indians()));
                    //deckOfAction.add(new Pair<Card,ActionCard>(card,new gatling()));
                    //deckOfAction.add(new Pair<Card,ActionCard>(card,new duel()));
//                    deckOfAction.add(new Pair<Card,ActionCard>(card,new wellsfargo()));
//                    deckOfAction.add(new Pair<Card,ActionCard>(card,new saloon()));
//                    deckOfAction.add(new Pair<Card,ActionCard>(card,new emporio()));
//                    deckOfAction.add(new Pair<Card,ActionCard>(card,new volcanic()));
                    deckOfAction.add(new Pair<Card,ActionCard>(card,new volcanic()));
                    deckOfAction.add(new Pair<Card,ActionCard>(card,new mustang()));
//                    deckOfAction.add(new Pair<Card,ActionCard>(card,new miring()));
//                    deckOfAction.add(new Pair<Card,ActionCard>(card,new barile()));
                    deckOfAction.add(new Pair<Card,ActionCard>(card,new dinamite()));
                    deckOfAction.add(new Pair<Card,ActionCard>(card,new prigione()));
                }
            }
            shuffleDeck(3);
        }

        public void addActionCard (Pair<Card,ActionCard> card){
            deckOfAction.add(card);
        }

        public Pair<Card,ActionCard> dealCard() {
            Pair<Card,ActionCard> dealtCard = deckOfAction.get(0);
            deckOfAction.remove(dealtCard);
            return dealtCard;
        }

        public void shuffleDeck(int shuffleAmount) {
            for(int i=0;i<=shuffleAmount;i++) {
                Collections.shuffle(deckOfAction);
            }
        }

        public List<Card> getCard(){
            return deckOfCard;
        }
        public List<Pair<Card,ActionCard>> getDeckOfCard(){
            return deckOfAction;
        }
        public void addToTrash(Pair<Card,ActionCard> th){
            deckOfAction.add(th);
        }
    }
