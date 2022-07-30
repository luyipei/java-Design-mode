public class RedState extends Abstratebank{
    public RedState(Abstratebank state) {
        this.balance=state.balance;
        this.account=state.account;
        this.stateName="红色状态";
    }

    @Override
    public void withdraw(int money) {
        System.out.println("账户异常！无法取款！");
    }

    @Override
    public void checkstate(int money) {
        if (this.balance>=0){
            account.setState(new GreenState(this));
        }
        else if (this.balance>=-1000)
        {
            account.setState(new YellowState(this));
        }

    }
}
