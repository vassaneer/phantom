package phantomnetbean.Client.ActionCard;

import  phantomnetbean.Client.getInput;

public class catbalou extends ActionCard{
    public catbalou(){
        super();
        enable = true;
    }
    public void ability(){
        System.out.println(choose("empty"));
        int b = new getInput().getA();
        choose("empty").get(b).wasDiscard();
    }

    @Override
    public String toString() {
        return "discard !!";
    }
}
