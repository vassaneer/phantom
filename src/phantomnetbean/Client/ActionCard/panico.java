package phantomnetbean.Client.ActionCard;

import  phantomnetbean.Client.getInput;

public class panico extends ActionCard {
    public panico(){
        super();
        enable = true;
    }
    public void ability(){
        System.out.println(choose("one"));
        int b = new getInput().getA();
        own.setHand(choose("one").get(b).wasDeal());
    }

    @Override
    public String toString() {
        return "panico!!! ";
    }
}
