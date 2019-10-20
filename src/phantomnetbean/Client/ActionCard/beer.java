package phantomnetbean.Client.ActionCard;

import  phantomnetbean.Client.getInput;

public class beer extends ActionCard {
    public beer(){
        super();
        enable = true;
    }
    public void ability(){
        System.out.println(choose("any"));
        int b = new getInput().getA();
        choose("any").get(b).setHp(1);
    }

    @Override
    public String toString() {
        return "beer!!! ";
    }
}
