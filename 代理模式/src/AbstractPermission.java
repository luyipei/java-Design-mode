public interface AbstractPermission{
    //抽象权限类，声明了真实主题角色提供的业务方法，是真实主题角色和代理主题角色的公共接口
    void modifyUserInfo();
    void viewNote();
    void publishNode();
    void modifyNode();
    void setLevel1(int level);

}
