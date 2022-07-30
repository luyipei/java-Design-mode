public class Administrator extends User{
    public Administrator(){
        System.out.println("创建管理员对象！");
    }
    @Override
    public void diffOperation() {
        System.out.println("管理员拥有创建和管理请假条权限！");

    }
}
