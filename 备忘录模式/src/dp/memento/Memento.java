package dp.memento;
//为了实现封装功能，不允许外部直接访问该备忘录类，因此该类必须定义为包内可见
class Memento {
    //备忘录
    String account;
    String password;
    String telNo;

    public Memento(String account, String password, String telNo) {
        this.account = account;
        this.password = password;
        this.telNo = telNo;
    }

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
}
