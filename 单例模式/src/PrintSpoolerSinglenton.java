public class PrintSpoolerSinglenton {
    private static PrintSpoolerSinglenton instance;
    private PrintSpoolerSinglenton(){

    }
    public static PrintSpoolerSinglenton getInstance() throws PrintSpoolerException{
        if (instance==null){
            System.out.println("创建打印池");
            instance=new PrintSpoolerSinglenton();
        }
        else
        {
            throw new PrintSpoolerException("打印池正在工作中");
           //System.out.println("打印池正在工作中");
        }
        return instance;
    }
    public void manegeJobs(){
        System.out.println("管理打印任务");

    }
}
