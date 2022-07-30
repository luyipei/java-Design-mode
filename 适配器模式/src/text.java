public class text {
    public static void main(String[] args) {
        Phone phone=new Phone();
        phone.changing(new Adopter5v2());


        ClipherAdapter clipherAdapter=new ClipherAdapter();
        DataOperator dap=(DataOperator) clipherAdapter;
        dap.setPassword("sunnyLiu");
        String ps=dap.getPassword();
        String es=dap.doEncrypt(6,ps);
        System.out.println("明文："+ps);
        System.out.println("密文："+es);


        DBAdapyer dbAdapyer=new DBAdapyer();
        Root root=(Root) dbAdapyer;
        root.run();
        root.cry();
    }
}
