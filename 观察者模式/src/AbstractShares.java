import java.util.ArrayList;

public abstract class AbstractShares {
    //观察者
    protected ArrayList observes=new ArrayList<>();
    public void attach(Listener listener){
        observes.add(listener);
    }
    public void remove(Listener listener){
        observes.remove(listener);
    }
    public abstract void notice();

    public abstract void updataprice(float price);
}
