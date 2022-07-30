public class text {
    public static void main(String[] args) {
        //行为型模式

        Leader dirctor=new Dirctor("奏太");
        Leader manger=new Manger("德凯");
        Leader generalManger=new GeneralManger("张三");

        dirctor.setSuccessor(manger);
        manger.setSuccessor(generalManger);

        LeaveRequest leaveRequest=new LeaveRequest("特利迦",10);

        dirctor.handleRequest(leaveRequest);

    }
}
