public abstract class Abstratebank {
    protected Account account;
    protected String stateName;
    protected int balance;
    public void deposie(int money){
        //存款
        this.balance+=money;
        System.out.println(this.account.getAccountName()+"存下"+money);
        //检测更新一次状态
        checkstate(money);


        System.out.println(this.account.getAccountName()+"卡中的余额为："+this.balance+"账户状态为："+this.account.getState().stateName);

    }
    public void withdraw(int money)
    {
        //取钱
        this.balance-=money;
        System.out.println(this.account.getAccountName()+"取出"+money);
        //检查更新一次状态
        checkstate(money);
        System.out.println(this.account.getAccountName()+"卡中的余额为："+this.balance+"账号状态为："+this.account.getState().stateName);

    }
    public abstract void checkstate(int money);
}
