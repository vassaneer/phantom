package phantomnetbean.Client.ActionCard;

import phantomnetbean.Client.Personal.Player;
import  phantomnetbean.Client.getInput;

public class saloon extends ActionCard {
    public saloon(){
        super();
        enable = true;
    }
    public void ability(){
        System.out.println("choose one from \n 1:add life all \n 2:add one ");
        int b = new getInput().getA();
        if(b==1) for(Player a:choose ("any")) a.setHp(1);
        else if(b==2) {
            ActionCard a = new beer();
            a.setAllPlayer(allPlayer);
            a.ability();
        }
    }

    @Override
    public String toString() {
        return "saloon";
    }
}


