import dp.RPGmemento.RPGCaretaker;
import dp.RPGmemento.RPGUSERInfoDTO;
import dp.memento.Caretaker;
import dp.memento.UserInfoDTO;

public class text {
    public static void main(String[] args) {
        UserInfoDTO user=new UserInfoDTO();
        Caretaker c=new Caretaker();   //创建负责人

        user.setAccount("450283912");
        user.setPassword("1234567");
        user.setTelNo("130000000000000");
        System.out.println("状态以");
        user.show();
        //负责人操作
        c.setMemento(user.saveMemento());//保存备忘录
        System.out.println("---------------");
        user.setPassword("1111111");
        user.setTelNo("13100000111");
        System.out.println("状态二");
        user.show();
        System.out.println("----------------");
        user.restoreMemenoto(c.getMemento());//从备忘录中恢复
        System.out.println("回到状态一");
        user.show();
        System.out.println("------------------");


        RPGUSERInfoDTO usear=new RPGUSERInfoDTO(63,"特利迦","场景一");
        RPGCaretaker c1=new RPGCaretaker();
        //将备忘录保存下来
        c1.setMemento(usear.saveMemento());
        usear.show();
        System.out.println("------------");
        usear.setBlood(15);
        usear.setScene("场景二");
        usear.show();
        System.out.println("-------------");
        //恢复
        usear.restoreMemento(c1.getMemento());
        usear.show();





    }
}
