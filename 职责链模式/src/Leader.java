public abstract class Leader {
    protected Leader successor;
    protected String name;
    public Leader(String name){
        this.name=name;
    }
    public void setSuccessor(Leader successor){
        this.successor=successor;

    }
    //处理请求的操作
    public abstract void handleRequest(LeaveRequest request);
}
