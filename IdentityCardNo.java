public class IdentityCardNo {
    private String no;

    private IdentityCardNo(){

    }
    private static IdentityCardNo instance;

    public void setIdentityCardNo(String no){
        this.no=no;
    }
    public String getIdentityCardNo(){
        return this.no;
    }

    public static IdentityCardNo getinstance()
    {
        if (instance==null)
        {
            System.out.println("Firsr Try");
            instance=new IdentityCardNo();
        }
        else {
            System.out.println("Second Try");
        }
        return instance;
    }
}
