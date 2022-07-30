public class TVChangeCommand implements AbstractCommand{
    private Televsion tv;

    public TVChangeCommand() {
       tv=new Televsion();
    }

    @Override
    public void execute() {
        tv.changeChannel();

    }
}
