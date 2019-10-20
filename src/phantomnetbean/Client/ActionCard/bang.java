package phantomnetbean.Client.ActionCard;

import  phantomnetbean.Client.getInput;

public class bang extends ActionCard {
    public bang() {
        super();
        enable = true;
    }

    public void ability() {
        int r = own.getRange();
        //for(int i )
        System.out.println(choose("inrange"));
        int b = new getInput().getA();
        choose("inrange").get(b).triggerCheck(new dodges().getClass().getName());
    }
    @Override
    public String toString() {
        return "bang !!";
    }
}

