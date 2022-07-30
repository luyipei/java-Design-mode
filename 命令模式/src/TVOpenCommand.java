public class TVOpenCommand implements AbstractCommand{
    private Televsion tv;
    public TVOpenCommand(){
        tv=new Televsion();
    }
    @Override
    public void execute() {
        tv.open();
    }
}
