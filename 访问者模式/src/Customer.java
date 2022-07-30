public class Customer extends Visitor{
    @Override
    public void visit(Apple apple) {
        System.out.println("顾客："+name+"选苹果");
    }

    @Override
    public void visit(Book book) {
        System.out.println("顾客："+name+"买书");

    }
    //访问者的子类，顾客
}
