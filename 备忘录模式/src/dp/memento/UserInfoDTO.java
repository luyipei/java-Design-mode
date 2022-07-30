package dp.memento;

public class UserInfoDTO {

    //原发器，可以保存备忘录，也可以从备忘录中恢复状态
    private String account;
    private String password;
    private String telNo;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }
    //返回上一次保存的状态
    public Memento saveMemento(){
        return new Memento(account,password,telNo);
    }
    //保存当前状态
    public void restoreMemenoto(Memento memento){
        this.account=memento.getAccount();
        this.password=memento.getPassword();
        this.telNo=memento.getTelNo();
    }
    public void show(){
        System.out.println("账号："+this.account);
        System.out.println("密码："+this.password);
        System.out.println("TelNo"+this.telNo);
    }
}
