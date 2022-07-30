public class SingleOne2 {

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

    private SingleOne2(){

    }
    private static SingleOne2 index;
    public static SingleOne2 getSingleOne2(){
        if(index==null){
            index=new SingleOne2();
        }
        return index;
    }
}
