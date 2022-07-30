import java.util.ArrayList;

public abstract class Mysubject {
    //抽象观察目标
    protected ArrayList observers=new ArrayList<>();
    //注册方法
    public void attach(MyObserver observer){
        observers.add(observer);

    }
    public void detach(MyObserver oberver){
        observers.remove(oberver);

    }

    public abstract void cry();//抽象通知方法
}
