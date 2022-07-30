public class JarPhone extends PhoneDecorator{
    public JarPhone(Phone phone) {
        super(phone);
    }
    public void Vibration(){
        System.out.println("第二种手机:");
        super.call();
        System.out.println("手机振动提醒");
        System.out.println("--------");
    }
}
