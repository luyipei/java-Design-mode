public class TVFactory {
    public static TV produceTV(String brand){
        if (brand.equalsIgnoreCase("Haier")){
            System.out.println("生产一台海尔电视");
            return new HaierTV();
        }
        else if(brand.equalsIgnoreCase("Hisense")){
            System.out.println("生产一台海信电视");
            return new HisenseTV();
        }
        else return null;


    }
}
