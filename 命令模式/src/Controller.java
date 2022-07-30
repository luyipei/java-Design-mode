public class Controller {
    //调用者，即充当遥控器的角色
    private AbstractCommand opencommand,closecommand,changecommand;
    public Controller(AbstractCommand opencommand,AbstractCommand closecommand,AbstractCommand changecommand)
    {
        this.opencommand=opencommand;
        this.closecommand=closecommand;
        this.changecommand=changecommand;
    }


    //编写功能函数来实现功能，这里直接调用命令就可以了
    public void open(){
        opencommand.execute();
    }

    public void close(){
        closecommand.execute();
    }

    public void change(){
        changecommand.execute();
    }


}
