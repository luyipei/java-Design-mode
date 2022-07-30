public class PermissionProxy implements AbstractPermission{

    //权限代理类
    private RealPermission permission=new RealPermission();
    private int level=0;


    @Override
    public void modifyUserInfo() {
        if (0==level)
        {
            System.out.println("对不起，您没有该权限！");
        }
        else if (1==level)
        {
            permission.modifyUserInfo();
        }

    }

    @Override
    public void viewNote() {
        System.out.println("查看帖子！");

    }

    @Override
    public void publishNode() {
        if (0==level)
        {
            System.out.println("对不起，您没有该权限！");
        }else if (1==level){
            permission.publishNode();
        }

    }

    @Override
    public void modifyNode() {
        if (0==level)
        {
            System.out.println("对不起，没有该权限！");
        }
        else if (1==level)
        {

            permission.modifyNode();
        }

    }

    @Override
    public void setLevel1(int level) {
        this.level=level;

    }
}
