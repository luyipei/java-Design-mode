public class text {
    public static void main(String[] args) {
        EFactory eFactory;
        Television television;
        AirConditioner airConditioner;
        eFactory=new HaierEFactory();
        television=eFactory.produceTelevision();
        airConditioner=eFactory.produceAirConditioner();
        television.play();;
        airConditioner.changeTmeerature();
    }
}
