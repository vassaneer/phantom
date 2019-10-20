package phantomnetbean.Client.Personal;

import phantomnetbean.Client.Deck.Deck;
import phantomnetbean.Client.ActionCard.*;
import phantomnetbean.Client.Card.Card;
import phantomnetbean.Client.getInput;
import javafx.util.Pair;

import java.util.*;

public class Player {
    private Role myRole;
    public Characters.Character myCharacter;
    private int hp;
    private int range;
    private int distanceToMe;
    private ArrayList <Pair<Card, ActionCard>> myhands = new ArrayList<Pair<Card,ActionCard>>();
    private ArrayList <Pair<Card, ActionCard>> myfield = new ArrayList<Pair<Card,ActionCard>>();
    private ArrayList<Pair<Card, ActionCard>> wasAction = new ArrayList<Pair<Card,ActionCard>>();
    private boolean protect = false;
    private Deck deckOndead;
    private Set<String> usedCard = new HashSet<String>();
    private final int MAXIMUMHP = 5;
    private boolean infinitebang = false;
    private boolean Isdead = false;
    private int id;

    public void setCharacter(Characters.Character ch){
        this.myCharacter = ch;
        if(!ch.equals(Characters.Character.PAULREGRET)) this.hp=4;
        else this.hp = 3;
    }
    
    public void setRole(Role rl){
        this.myRole = rl;
    }
    
    public int getPlayerId (){
        return this.id;
    }

    public void setPlayerId (int id){
        this.id = id;
    }
    // getIsdead
    public boolean getIsdead(){
        return Isdead;
    }

    // checkIsdead
    public void setIsdead(){
        if(isDead()) Isdead = true;
    }

    // use combine dodge
    public boolean triggerCheck (String checkCard){
        int indexOfNexus = fieldCheck(new barile().getClass().getName()).getValue();
        boolean checkNexus = fieldCheck(new barile().getClass().getName()).getKey();
        if(!checkNexus){
            for (Pair<Card, ActionCard> card : myhands) {
                if (card.getValue().getClass().getName().equals(checkCard)) {
                    System.out.println("Are you use " + checkCard + " (y/n): ");
                    String checkyes = new getInput().getS();
                    if (checkyes.equals("y")) {
                        deckOndead.addToTrash(card);
                        myhands.remove(card);
                        setProtect();
                        break;
                    } else {
                        break;
                    }
                }
            }
        }else {
            myfield.get(indexOfNexus).getValue().dealCheck();
        }
        return wasShoot();
    }

    public boolean getInfinitebang(){
        return infinitebang;
    }
    // get myfield
    public ArrayList <Pair<Card, ActionCard>> getMyfield(){
        return myfield;
    }
    // get myfield
    public Set<String> getUsedCard(){
        return usedCard;
    }
    // check field
    public Pair<Boolean,Integer> fieldCheck (String checkNexus){
        for(Pair<Card, ActionCard> p : myfield) if(p.getValue().getClass().getName().equals(checkNexus)) return new Pair<Boolean, Integer>(true,myfield.indexOf(p));
        return new Pair<Boolean, Integer>(false,-1);
    }
    // get caard from my hand
    public ArrayList <Pair<Card, ActionCard>> getMyhand(){
        return myhands;
    }
    // get size in hand
    public int getSizeMyhand(){
        return myhands.size();
    }
    // check
    public boolean ActionEmpty(){
        return wasAction.isEmpty();
    }
    // set action
    public ArrayList<Pair<Card,ActionCard>> getWasAction(){
        return wasAction;
    }
    public void setProtect(){
        protect = true;
    }
    public void setDistanceToMe(int i){
        distanceToMe+=i;
    }
    // set infinitebang
    public void setInfinitebang(boolean check){
        infinitebang = check;
    }
    // set hp ? increase:decrease
    public void setHp(int n){
        if(hp<=MAXIMUMHP) {
            if(n<=0) hp+=n;
            else{
                if(hp < MAXIMUMHP) hp+=n;
            }
        }
    }
    // get distance to see me
    public int getDistanceToMe(){
        return distanceToMe;
    }
    // get range
    public int getRange(){
        return range;
    }
    // show nexus
    public void showNexus(boolean check){
        System.out.println(myCharacter+" Hand");
        for(Pair <Card,ActionCard> c : myfield){
            if(check){
                System.out.println(myfield.indexOf(c)+1+" :"+c.getKey()+" "+c.getValue());
            }else{
                System.out.println(myfield.indexOf(c)+1+" : blank");
            }
        }
        for(Pair <Card,ActionCard> c : wasAction){
            if(check){
                System.out.println(wasAction.indexOf(c)+1+myfield.size()+" :"+c.getKey()+" "+c.getValue());
            }else{
                System.out.println(wasAction.indexOf(c)+1+myfield.size()+" : blank");
            }
        }
    }
    // show my hand Card
    public void showHand(boolean check){
        System.out.println(myCharacter+" Hand");
        for(Pair <Card,ActionCard> c : myhands){
            if(check){
                System.out.println(myhands.indexOf(c)+1+" :"+c.getKey()+" "+c.getValue());
            }else{
                System.out.println(myhands.indexOf(c)+1+" : blank");
            }
        }
    }
    public Player(){
    }
    // get character
    public Characters.Character getCharacter(){
        return this.myCharacter;
    }
    // constructer player
    public Player(Characters.Character ch ,Role rl ,int myhp ,Deck deck ){
        myCharacter = ch;
        myRole =rl ;
        hp = myhp;
        range = 1;
        deckOndead = deck;
        distanceToMe = 1;
        if(rl.checkRole().equals("SHERIFF")){
            hp++;
        }
    }
    // use pair catbalou
    public void wasDiscard(){
        showNexus(true);
        int b = new getInput().getA();
        Pair<Card,ActionCard> temp;
        if(b>myfield.size()){
            temp = wasAction.remove(b-1);
        }else{
            temp = myfield.remove(b-1);
        }
        temp.getValue().destructer();
        deckOndead.addToTrash(temp);
    }
    // use pair panico
    public Pair<Card,ActionCard> wasDeal(){
        showHand(false);
        int b = new getInput().getA();
        return myhands.remove(b-1);
    }
    public void deRange(int rg){
        range += rg;
    }
    // use to set range of gun
    public void setRange(int rg){
        range = rg;
    }
    public void increaseRange(){
        range++;
    }
    // check is player is dead ??
    public boolean isDead(){
        return hp<=0;
    }
    public void disCard(){
        if(myfield.size()>0){
            System.out.println("select [");
            for(int i = 1 ; i < myfield.size() ; i++){
                System.out.print(i+" ,");
            }
            System.out.println(myfield.size()+" ]");
            int a = new getInput().getA();
            //gotoTrash(myfield.get(a-1));
            myfield.remove(a-1);
        }
    }
    // add to this player
    public void setHand(Pair<Card,ActionCard> hand){
        myhands.add(hand);
    }
    // add field
    public void setField(Pair<Card,ActionCard> hand){
        myfield.add(hand);
    }
    public int getlife(){ return hp; }
    public void showlife(){
        System.out.println(hp);
    }
    // use combine bang
    public boolean wasShoot (){
        if(!protect){
            setHp(-1);
            setIsdead();
            protect = false;
            return true;
        }
        protect = false;
        return false;
    }

    // clear set of usedCard
    public void clearUsedCard(){
        usedCard.clear();
    }

    // show Role if SHERRIFF
    public void ShowRole(){
        if(myRole.Show()){
            System.out.println("SHERRIFF");
        }
    }
    public Role getMyRole() {return myRole;}
    // IS crucial Role
    public boolean crucial(){
        return myRole.checkRole().equals("SHERIFF");
    }
    @Override
    public String toString() {
        return "Character :"+myCharacter+"\n"+hp;
    }
}
