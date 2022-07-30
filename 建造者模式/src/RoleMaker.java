public class RoleMaker {
    private MakeRole makeRole=new MakeRoleA();
    //给建造工厂赋值
    public void setMakeRole(MakeRole makeRole){
        this.makeRole=makeRole;
    }
    //返回角色
    public Role getrole(){
        makeRole.buildsex();
        makeRole.buildclothes();
        makeRole.buildface();
        makeRole.buildhair();
        return makeRole.getrole();
    }
}
