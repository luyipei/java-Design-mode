public class text {
    //
    public static void main(String[] args) {
        AbstractCommand openCommand,closeCommand,changeCommand;
        openCommand=new TVOpenCommand();
        changeCommand=new TVChangeCommand();
        closeCommand=new TVCloseCommand();
        Controller controller=new Controller(openCommand,closeCommand,changeCommand);
        controller.open();
        controller.change();
        controller.close();


        System.out.println("-------------");
        Command open,create,exit;
        open=new OpenCommand();
        create=new CreateCommand();
        exit=new EditCommand();
        Menu menu1,menu2,menu3;
        menu1=new Menu(open);
        menu2=new Menu(create);
        menu3=new Menu(exit);
        MenuItem menuItem=new MenuItem(menu1,menu2,menu3);
        menuItem.open();
        menuItem.create();
        menuItem.exit();



    }
}