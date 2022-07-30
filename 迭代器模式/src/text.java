public class text {
    public static void display(MyIterator myIterator){
        while (!myIterator.isLast()){
            System.out.println(myIterator.currentindex());
            myIterator.next();
        }
    }
    public static void lastdisplay(MyIterator myIterator){
        myIterator.setindex(5);
        while (!myIterator.isFirst())
        {
            System.out.println(myIterator.currentindex());
            myIterator.previous();
        }
    }
    public static void main(String[] args) {
        Commodity commodity=new Commodity();
        MyIterator myIterator=commodity.createcommodity();
        display(myIterator);

        System.out.println("-------------");
        lastdisplay(myIterator);


    }
}
