public class Dirctor extends Leader{
    //主任
    //构造函数
    public Dirctor(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays()<3)
        {
            System.out.println("主任"+name+"审批员工"+request.getLeaveName()+"的请假条，请假天数为："+request.getLeaveDays()+"天");

        }
        else {
            if (this.successor!=null){
                this.successor.handleRequest(request);
                System.out.println("请假天数超过主任权限，转到经理");
            }
        }

    }
}
