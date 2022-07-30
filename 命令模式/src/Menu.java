public class Menu {
    private Command command;
    public Menu(Command command) {
        this.command=command;
    }

    //主菜单，包含一些菜单项
    public void click(){
        //点击事件
        command.execute();

    }
    public Menu addMenuItem(){
        return null;
    }

}
