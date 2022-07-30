public class DBAdapyer implements Root{
    private Dog dog=new Dog();
    private Bird bird=new Bird();
    @Override
    public void run() {
        System.out.println("机器人模仿：");
        dog.run();

    }

    @Override
    public void cry() {
        System.out.println("机器人模仿");
        bird.cry();

    }
}
