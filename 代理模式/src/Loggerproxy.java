public class Loggerproxy implements AbstractSubject{
    private BusinessClass businessClassl;
    private int i=1;
    @Override
    public void mothod() {
        if (i==1){
            businessClassl=new BusinessClass();
            businessClassl.mothod();
        }
        if (i==0)
        {
            System.out.println("mothod方法错误");
        }

    }
}
