public class text {
    public static void main(String[] args) {
        ForumAccount account=new ForumAccount("张三");
        account.writeNote(20);
        System.out.println("---------------");
        account.downloadFile(20);
        System.out.println("----------------");
        account.replyNote(100);
        System.out.println("-----------------");
        account.writeNote(40);
        System.out.println("-----------------");
        account.downloadFile(80);
        System.out.println("-----------------");
        account.downloadFile(150);
        System.out.println("-----------------");
        account.writeNote(1000);
        System.out.println("--------------");
        account.downloadFile(80);
        System.out.println("-------------------");


        System.out.println("-----------------");
        Account account1=new Account("戴卡");
        account1.deposit(100);
        account1.withdraw(200);
        account1.withdraw(1300);
        account1.withdraw(100);
        account1.deposit(500);
        account1.deposit(1666);


    }
}
