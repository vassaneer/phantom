package phantomnetbean.Client.ActionCard;

import  phantomnetbean.Client.getInput;

public class duel extends ActionCard {
    public duel(){
        super();
        enable = true;
    }
    public void ability(){
        System.out.println(choose("except"));
        int b = new getInput().getA();
        while(true) {
            System.out.println(own.myCharacter);
            if (own.triggerCheck(new bang().getClass().getName())) break;
            System.out.println(choose("except").get(b-1).myCharacter);
            if(choose("except").get(b-1).triggerCheck(new bang().getClass().getName())) break;
        }
    }

    @Override
    public String toString() {
        return "duel !!";
    }
}
