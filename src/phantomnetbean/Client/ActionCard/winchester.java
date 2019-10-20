package phantomnetbean.Client.ActionCard;

public class winchester extends ActionCard implements NexusCard,Gun {
    public winchester(){
        super();
    }
    public void ability(){
        own.deRange(4);
        System.out.println(own.getRange());
    }

    public void destructer(){
        own.deRange(-4);
    }

    @Override
    public String toString() {
        return "range 5 !!";
    }
}
