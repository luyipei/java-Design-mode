public class Account {
    private Abstratebank state;
    private String accountName;

    public Account(String accountName) {
        this.accountName = accountName;
        System.out.println("账户创建成功！");
        state=new GreenState(this);
    }

    public Abstratebank getState() {
        return state;
    }

    public void setState(Abstratebank state) {
        this.state = state;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    public void deposit(int money){
        state.deposie(money);
    }
    public void withdraw(int money){
        state.withdraw(money);
    }

}
