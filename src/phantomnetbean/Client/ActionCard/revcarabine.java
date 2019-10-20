package phantomnetbean.Client.ActionCard;

public class revcarabine extends ActionCard implements NexusCard,Gun {
    public revcarabine(){
        super();
    }
    public void ability(){
        own.deRange(3);
        System.out.println(own.getRange());
    }

    public void destructer(){
        own.deRange(-3);;
    }
    @Override
    public String toString() {
        return "range 4 !!";
    }
}