public class text {
    public static void main(String[] args) {
        GeneralSwitchFacade generalSwitchFacade=new GeneralSwitchFacade();
        generalSwitchFacade.on();
        System.out.println("------------");
        generalSwitchFacade.off();
        System.out.println("-------------");
        EncryptFacade encryptFacade=new EncryptFacade();
        encryptFacade.fileEncrypt("学习资料");

    }
}
