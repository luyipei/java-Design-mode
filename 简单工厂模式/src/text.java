import javax.jws.soap.SOAPBinding;

public class text {
    public static void main(String[] args) {
/*
        PayMethodFactory payMethodFactory=new PayMethodFactory();
        AbstructPay abstructPay=payMethodFactory.getPayMethod("cash");
        abstructPay.pay();

 */
/*
        TV tv;
        String BrandName="Haier";
        tv=TVFactory.produceTV(BrandName);
        tv.play();
        
 */


        User user=UserFacor.getUser(1);
        user.sameOperation();
        user.diffOperation();
    }
}
