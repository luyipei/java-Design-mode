public class YellowState extends Abstratebank{
    public YellowState(Abstratebank state) {
        this.balance=state.balance;
        this.account=state.account;
        this.stateName="黄色状态";
    }

    @Override
    public void checkstate(int money) {
        if (this.balance>0){
            //更新到绿色模式
            account.setState(new GreenState(this));
        }else if (this.balance<-1000)
        {
            //转换成红色模式，只能存款不能取钱，将取到的前还回去，并提示超出额度，取钱失败
            account.setState(new RedState(this));

        }

    }
}
