public class singleone {

    private int num;
    private String name;

    public void setName(String name) {
        this.name = name;
    }
    public void setnum(int num){
        this.num=num;
    }
    public int getnum()
    {
        return this.num;
    }
    public String getName(){
        return this.name;
    }

    //私有化类
    private singleone(){

    }
    //内部创建实例
    private final static singleone intex=new singleone();

    //提供一个静态方法来返回实例
    public static singleone getsingleone(){
        return intex;
    }
}



