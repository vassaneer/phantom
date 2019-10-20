package phantomnetbean.Client.ActionCard;

public class miring extends ActionCard implements NexusCard,canstack {
    public miring(){
        super();
    }
    public void ability(){
        own.increaseRange();
        System.out.println(own.getDistanceToMe());
    }

    public void destructer(){
        own.setRange(-1);;
    }
    @Override
    public String toString() {
        return "scope !!";
    }
}
