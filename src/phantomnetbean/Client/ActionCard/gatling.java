package phantomnetbean.Client.ActionCard;

import phantomnetbean.Client.Personal.Player;

public class gatling extends ActionCard{
    public gatling(){
        super();
        enable = true;
    }
    public void ability(){
        System.out.println(choose("except"));
        for(Player c:choose("except")){
            c.triggerCheck(new dodges().getClass().getName());
        }
    }

    @Override
    public String toString() {
        return "gatling !!";
    }
}