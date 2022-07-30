import java.util.ArrayList;

public class WordFactory {
    private ArrayList devices= new ArrayList();
    public WordFactory(){
        WordDevice nd1=new Word("Java");
        devices.add(nd1);
    }
    public WordDevice getWord(){
        return (WordDevice) devices.get(0);

    }

}
