public class MenuItem {
    //菜单项
    private Menu menuopen,menucreat,menuexit;

    public MenuItem(Menu menuopen, Menu menucreat, Menu menuexit) {
        this.menuopen = menuopen;
        this.menucreat = menucreat;
        this.menuexit = menuexit;
    }
    public void open(){
        menuopen.click();
    }
    public  void create(){
        menucreat.click();
    }
    public void exit(){
        menuexit.click();
    }
}

