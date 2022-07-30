public class TCLEFactory implements EFactory{
    @Override
    public Television produceTelevision() {
        System.out.println("生产一台TCL电视机！");
        return new TCLTelevision();
    }

    @Override
    public AirConditioner produceAirConditioner() {
        System.out.println("生产一台TCL空调！");
        return new TCLAirConditioner();
    }
}
