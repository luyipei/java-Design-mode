public class Adopter5V extends Home implements Adopter{
    @Override
    public int provide5() {
        int src=Home.provide220();
        src=src/44;
        System.out.println("5v电压");
        return src;
    }
}
