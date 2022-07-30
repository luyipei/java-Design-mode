public abstract class MakeRole {
    protected Role role=new Role();
    public abstract void buildsex();
    public abstract void buildclothes();
    public abstract void buildface();
    public abstract void buildhair();
    public Role getrole(){
        return role;
    }
}
