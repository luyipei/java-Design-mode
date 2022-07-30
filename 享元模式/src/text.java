public class text {
    public static void main(String[] args) {
        NetworkDevice nd1,nd2,nd3,nd4,nd5;
        DeviceFactory df=new DeviceFactory();
        nd1=df.getNetworkDevice("cisco");
        nd1.use();


        nd2=df.getNetworkDevice("cisco");
        nd2.use();


        nd3=df.getNetworkDevice("cisco");
        nd3.use();

        nd4=df.getNetworkDevice("tp");
        nd4.use();

        nd5=df.getNetworkDevice("tp");
        nd5.use();

        System.out.println(df.getTotalDevice());
        System.out.println(df.getTotalTerminal());


        System.out.println("-------------");
        NetworkDeviceOut nd6,nd7,nd8,nd9,nd10;
        DeviceFactoryOut df1=new DeviceFactoryOut();

        nd6=df1.getNetworkDevice("cisco");
        nd6.use(new Port("1001"));


        System.out.println("------------");
        WordFactory wf=new WordFactory();
        WordDevice word1;
        word1=wf.getWord();
        word1.write("红色",32);










    }
}
