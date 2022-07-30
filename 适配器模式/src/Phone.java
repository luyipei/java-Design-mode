public class Phone {
    public void changing(Adopter adopter){
        int src=0;
        src=adopter.provide5();
        if (src==5){
            System.out.println("电压为5v，手机正在充电");
        }else {
            System.out.println("电压不匹配");
        }

    }
}
