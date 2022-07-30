public class text {
    public static void main(String[] args) {
        AbstractPermission permission;
        permission=new PermissionProxy();
        permission.modifyUserInfo();
        permission.viewNote();
        permission.publishNode();
        permission.modifyNode();;
        System.out.println("-------------------");
        permission.setLevel1(1);
        permission.modifyUserInfo();
        permission.viewNote();
        permission.publishNode();
    }

}
