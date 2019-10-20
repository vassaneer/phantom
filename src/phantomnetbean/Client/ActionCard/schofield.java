package phantomnetbean.Client.ActionCard;

public class schofield extends ActionCard implements NexusCard,Gun {
    public schofield(){
        super();
    }
    public void ability(){
        own.deRange(1);
        System.out.println(own.getRange());
    }
    public void destructer(){
        own.deRange(-1);
    }

    @Override
    public String toString() {
        return "range 2 !!";
    }
}

