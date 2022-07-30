public class text {
    public static void main(String[] args) {
        Product book1=new Book();
        Product book2=new Book();
        Product book3=new Book();
        Product apple1=new Apple();
        Product apple2=new Apple();
        Visitor customer=new Customer();
        customer.setName("特利迦");
        Visitor saler=new Saler();
        saler.setName("德凯");
        //购物车
        BuyBasket buyBasket=new BuyBasket();
        buyBasket.addProduct(book1);
        buyBasket.addProduct(book2);
        buyBasket.addProduct(book3);
        buyBasket.addProduct(apple1);
        buyBasket.addProduct(apple2);

        buyBasket.accept(customer);
        System.out.println("-------------");
        buyBasket.accept(saler);

        System.out.println("----------------");

        Student student=new Student();
        student.setName("张三");
        student.setPaperAmount(3);
        student.setScore(97);

        Teacher teacher1=new Teacher();
        teacher1.setFeedbackScore(93);
        teacher1.setName("李四");
        teacher1.setPaperAmount(11);


        AwardCheck awardCheck=new ScientificAwardCheck();
        awardCheck.visit(student);
        awardCheck.visit(teacher1);







    }
}
