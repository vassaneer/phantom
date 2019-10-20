package phantomnetbean.Client.ActionCard;

public class mustang extends ActionCard implements NexusCard,canstack {
    public mustang(){
        super();
    }
    public void ability(){
        own.setDistanceToMe(1);
        System.out.println(own.getDistanceToMe());
    }

    public void destructer(){
        own.setDistanceToMe(-1);;
    }

    @Override
    public String toString() {
        return "mustang!!";
    }
}
