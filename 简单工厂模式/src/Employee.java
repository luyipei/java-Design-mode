public class Employee extends User{
    public Employee(){
        System.out.println("创建员工对象！");
    }
    @Override
    public void diffOperation() {
        System.out.println("员工拥有创建请假条权限！");

    }
}
