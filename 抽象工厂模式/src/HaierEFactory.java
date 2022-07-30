public class HaierEFactory implements EFactory{
    @Override
    public Television produceTelevision() {
        System.out.println("生产一台海尔电视！");
        return new HaierTelevision();
    }

    @Override
    public AirConditioner produceAirConditioner() {
        System.out.println("生产一台海尔空调！");
        return new HaierAirConditioner();
    }
}
