public class RealPermission implements AbstractPermission{
    //真实权限类



    @Override
    public void modifyUserInfo() {
        System.out.println("修改用户信息！");

    }

    @Override
    public void viewNote() {

    }

    @Override
    public void publishNode() {
        System.out.println("发布新帖！");

    }

    @Override
    public void modifyNode() {
        System.out.println("修改发帖内容！");

    }

    @Override
    public void setLevel1(int level) {

    }
}
