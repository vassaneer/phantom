package phantomnetbean.Client.ActionCard;


public class volcanic extends ActionCard implements NexusCard,Gun {
    public volcanic(){
        super();
    }
    public void ability(){
        own.setInfinitebang(true);
    }
    public void destructer(){
        own.setInfinitebang(false);
    }
    @Override
    public String toString() {
        return "infinite bang !!";
    }
}
