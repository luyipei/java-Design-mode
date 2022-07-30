public class PayMethodFactory {
    //工厂
    public static AbstructPay getPayMethod(String type){
        if (type.equalsIgnoreCase("cash")){
            return new CashPay();
        }
        else if (type.equalsIgnoreCase("creditcard"))
        {
            return new CreditcardPay();
        }
        else return null;

    }
}
