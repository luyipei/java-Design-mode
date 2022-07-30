public class MakeRoleA extends MakeRole{
    @Override
    public void buildsex() {
        role.setSex("男");

    }

    @Override
    public void buildclothes() {
        role.setFace("T恤");

    }

    @Override
    public void buildface() {
        role.setFace("瓜子脸");

    }

    @Override
    public void buildhair() {
        this.role.setHair("刘海");
    }
}
