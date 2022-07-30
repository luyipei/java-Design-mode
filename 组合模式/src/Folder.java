import java.util.ArrayList;

public class Folder extends AntiVirus{
    //文件夹
    private ArrayList list=new ArrayList<>();
    public void add(AntiVirus antiVirus){
        list.add(antiVirus);
    }
    public void remove(AntiVirus antiVirus){
        list.remove(antiVirus);
    }
    @Override
    public void killVirus() {
        for (Object object:list)
        {
            ((AntiVirus)object).killVirus();
        }

    }
}
