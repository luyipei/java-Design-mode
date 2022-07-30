public class SimplePhone implements Phone{
    @Override
    public void call() {
        System.out.println("第一种手机");
        System.out.println("提醒用户接电话");
        System.out.println("----------");
    }
}
