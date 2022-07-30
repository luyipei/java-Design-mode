public class text {
    public static void main(String[] args)
    {
        Mysubject mysubject=new Cat();
        MyObserver obs1,obs2,obs3;
        obs1=new Mouse();
        obs2=new Mouse();
        obs3=new Dog();
        MyObserver obs4=new Pig();

        mysubject.attach(obs1);
        mysubject.attach(obs2);
        mysubject.attach(obs3);
        mysubject.attach(obs4);
        mysubject.cry();


        System.out.println("---------------");
        AbstractShares shares;
        Listener buyer1,buyer2,buyer3,buyer4,buyer5;
        buyer1=new Buyer();
        buyer2=new Buyer();
        buyer3=new Buyer();
        buyer4=new Buyer();
        buyer5=new Buyer();



        shares=new Shares(16.0F);
        shares.attach(buyer1);
        shares.attach(buyer2);
        shares.attach(buyer3);
        shares.attach(buyer4);
        shares.attach(buyer5);
        shares.updataprice(17.0F);
        shares.notice();
        shares.updataprice(13);
        shares.notice();




    }
}
