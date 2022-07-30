public class Client {
    public static void display(Tevelision tv){
        TVIterator i=tv.createIterator();//生成了一个迭代器
        System.out.println("电视频道：");
        while (!i.isLast()){
            System.out.println(i.currentChannel().toString());
            i.next();
        }
    }

    public static void main(String[] args) {
        Tevelision tv;
        tv=(Tevelision) new SkyworthTelevsion();
        display(tv);
    }
}
