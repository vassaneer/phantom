package phantomnetbean.Client.ActionCard;

import phantomnetbean.Client.Personal.Player;

public class indians extends ActionCard{
    public indians(){
        super();
        enable = true;
    }
    public void ability(){
        System.out.println(choose("except"));
        for(Player c:choose("except")){
            c.triggerCheck(new bang().getClass().getName());
        }
    }

    @Override
    public String toString() {
        return "indians!!! ";
    }
}
