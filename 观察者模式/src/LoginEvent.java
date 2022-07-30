import java.util.EventObject;

public class LoginEvent extends EventObject {

    //事件类，封装与事件有关的信息
    //不是观察者的一部分，但可以在目标对象和观察者对象之间传递信息
    private String userName;
    private String password;


    public LoginEvent(Object source,String userName,String password) {
        super(source);
        this.userName=userName;
        this.password=password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
