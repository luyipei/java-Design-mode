public class TVCloseCommand implements AbstractCommand{
    private Televsion tv;

    public TVCloseCommand() {
        tv=new Televsion();
    }

    @Override
    public void execute() {
        tv.close();

    }
}
