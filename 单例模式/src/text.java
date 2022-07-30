public class text {
    public static void main(String[] args) {
        //System.out.println("你好");

        PrintSpoolerSinglenton ps1,ps2;
        try {
            ps1=PrintSpoolerSinglenton.getInstance();
            ps1.manegeJobs();
        } catch (PrintSpoolerException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("-----------------");

        try {
            ps2=PrintSpoolerSinglenton.getInstance();
            ps2.manegeJobs();
        } catch (PrintSpoolerException e) {
            System.out.println(e.getMessage());
        }
    }
}
