public class HaierTVFactory implements factory{
    @Override
    public TV productTV() {
        System.out.println("制造一台海尔电视！");
        return new HaierTV();
    }
}
