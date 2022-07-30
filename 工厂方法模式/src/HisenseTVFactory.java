public class HisenseTVFactory implements factory{
    @Override
    public TV productTV() {
        System.out.println("制造一台海信电视！");
        return new HisneseTV();
    }
}
