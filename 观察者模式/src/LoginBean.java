import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginBean extends JPanel implements ActionListener {
    JLabel lsbUserName,labPassword;
    JTextField textUesrName;
    JPasswordField textPassword;
    JButton btnLogin,btnClear;



    //定义一个抽象观察对象
    private LoginEventListener lel;
    //定义一个事件来传输数据
    private LoginEvent le;

    public LoginBean() {
        this.setLayout(new GridLayout(3,2));
        lsbUserName=new JLabel("用户名：");
        add(lsbUserName);
        textUesrName=new JTextField(20);
        add(textUesrName);

        labPassword=new JLabel("密码:");
        add(labPassword);
        textPassword=new JPasswordField(20);
        add(textPassword);

        btnLogin=new JButton("登录");
        add(btnLogin);
        btnClear=new JButton("清除");

        btnClear.addActionListener(this);
        btnLogin.addActionListener(this);
    }
    //实现注册方法
    public void addLoginEventListener(LoginEventListener lel){
        this.lel=lel;

    }
    //实现通知方法

    public void fireLoginEvent(Object object,String userName,String password){
        le=new LoginEvent(btnLogin,userName,password);
        lel.validateLogin(le);

    }
    public void actionPerformed(ActionEvent event)
    {
        if (btnLogin==event.getSource()){
        String userName=this.textUesrName.getText();
        String password=this.textPassword.getText();
        fireLoginEvent(btnLogin,userName,password);
         }
        if (btnClear==event.getSource()){
            this.textUesrName.setText("");
            this.textPassword.setText("");
        }

    }

}
