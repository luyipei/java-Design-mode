public abstract class AbstractState {
    protected ForumAccount acc;
    protected int point;
    protected String stateName;

    public abstract void checkState(int score);
    public void downloadFile(int score){
        System.out.println(acc.getName()+"下载文件，扣除"+score+"积分");
        this.point-=score;
        checkState(score);
        System.out.println("剩余积分为："+this.point+"当前级别："+acc.getState().stateName);

    }
    public void writeNode(int score){
        System.out.println(acc.getName()+"发布留言"+"增加"+score+"积分");
        this.point+=score;
        checkState(score);
        System.out.println("剩余积分为："+this.point+"当亲级别为："+acc.getState().stateName);
    }
    public void replyNote(int score)
    {
        System.out.println(acc.getName()+"回复留言，增加"+score+"积分");
        this.point+=score;
        checkState(score);
        System.out.println("剩余积分为："+this.point+"当前级别："+acc.getState().stateName);
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
}
