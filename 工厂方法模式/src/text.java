public class text {
    public static void main(String[] args) {
        /*
        TV tv;
        factory factory1;
        factory1=new HaierTVFactory();
        tv=factory1.productTV();
        tv.play();
         */

        Log log;
        LogFactory logFactory;
        logFactory=new FileLogFactory();
        log=logFactory.creatwLog();
        log.writelog();
    }

}
