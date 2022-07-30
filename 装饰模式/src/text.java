public class text {
    public static void main(String[] args) {
        Transform camaro;
        camaro=new Car();
        camaro.move();
        Robot bumblebee=new Robot(camaro);
        bumblebee.move();
        bumblebee.say();

        Clipher clipher;
        //第一次加密
        SimpleCipher simpleCipher=new SimpleCipher();
        simpleCipher.jiami();
        //第二次加密，装入装饰器中
        AdvancedCipher advancedCipher=new AdvancedCipher(simpleCipher);
        advancedCipher.secondjiami();
        //第三次加密，装入装饰器中
        ComplexCipher complexCipher=new ComplexCipher(advancedCipher);
        complexCipher.thirdjiami();



        Phone phone;
        SimplePhone simplePhone=new SimplePhone();
        simplePhone.call();
        JarPhone jarPhone=new JarPhone(simplePhone);
        jarPhone.Vibration();
        ComplexPhone complexPhone=new ComplexPhone(jarPhone);
        complexPhone.light();
   //     complexPhone.Vibration();

    }
}
