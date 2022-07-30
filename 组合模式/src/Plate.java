import java.util.ArrayList;

public class Plate extends MyElement{

    //容器构件
    private ArrayList list=new ArrayList<>();

    @Override
    public void eat() {
        for (Object object:list){
            //有递归那意思
            ((MyElement)object).eat();
        }
    }
    public void add(MyElement element){
        list.add(element);

    }
    public void remove(MyElement element){
        list.remove(element);

    }
}
