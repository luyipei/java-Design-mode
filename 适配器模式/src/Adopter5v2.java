public class Adopter5v2 implements Adopter{
    private Home home=new Home();//持有对象，而不是继承
//    public void setHome(Home home){
//        this.home=home;
//    }
    @Override
    public int provide5() {
        int src=0;
        src= home.provide220();
        src=src/44;
        System.out.println(src+"v电压");
        return src;
    }
}
