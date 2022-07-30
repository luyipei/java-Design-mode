public class ForumAccount {
    //环境类对象，论坛账号
    private  AbstractState state;
    String name;

    public ForumAccount(String name) {
        this.name = name;
        state=new PrimaryState(this);
        System.out.println("注册成功！");

    }

    public AbstractState getState() {
        return state;
    }

    public void setState(AbstractState state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void downloadFile(int score){
        state.downloadFile(score);

    }
    public void writeNote(int score){
        state.writeNode(score);

    }
    public void replyNote(int score){
        state.replyNote(score);

    }
}
