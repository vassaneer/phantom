package phantomnetbean.Client.ActionCard;

public class remington extends ActionCard implements NexusCard,Gun {
    public remington(){
        super();
    }
    public void ability(){
        own.deRange(2);
        System.out.println(own.getRange());
    }

    public void destructer(){
        own.deRange(-2);
    }
    @Override
    public String toString() {
        return "range 3 !!";
    }
}