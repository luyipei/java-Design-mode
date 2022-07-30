public class ComplexPhone extends JarPhone{
    public ComplexPhone(JarPhone phone){
        super(phone);
    }
    public void light(){
        System.out.println("第三类手机:");
        super.call();
        super.Vibration();
        System.out.println("手机闪灯");
        System.out.println("-------");

    }
}
