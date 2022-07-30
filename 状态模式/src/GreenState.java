public class GreenState extends Abstratebank{
    public GreenState(Abstratebank state) {
        this.account=state.account;
        this.balance=state.balance;
        this.stateName="绿色账户";

    }

    public GreenState(Account account) {
        this.account=account;
        this.balance=0;
        this.stateName="绿色账户";

    }

    @Override
    public void checkstate(int money) {
        if (this.balance<0)
        {
            //System.out.println("进入了这里1");
            if (this.balance>=-1000)
            {
                //System.out.println("进入了这里2");
                //转换成黄色模式，此时可以取钱也可以存款
                account.setState(new YellowState(this));
                //System.out.println(account.getState().stateName);
                //System.out.println("已完成状态更改");
            }
            else {
                //转换成红色模式，只能存款不能取钱，将取到的前还回去，并提示超出额度，取钱失败
                account.setState(new RedState(this));



            }
        }
    }
}
