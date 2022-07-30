public class Manger extends Leader{
    public Manger(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays()<10)
        {
            System.out.println("经理"+name+"审批员工"+request.getLeaveName()+"的请假条，请假天数为："+request.getLeaveDays()+"天");
        }
        else {
            if (this.successor!=null){
                this.successor.handleRequest(request);
                System.out.println("请假天数超过经理权限，转到总经理");
            }
        }

    }
    //经历

}
