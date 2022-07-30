public class text {
    public static void main(String[] args) {
        Color color;
        BigPen pen = new BigPen();
        color=new Red();
        pen.getColor(color);
        pen.draw("鲜花");


        OperatingSystemVersion operatingSystemVersion=new WindowsVersion();
        MPEGFile mpegFile=new MPEGFile();
        mpegFile.getOperatingSystemVersion(operatingSystemVersion);
        mpegFile.play();
        MP4File mp4File=new MP4File();
        mp4File.getOperatingSystemVersion(operatingSystemVersion);
        mp4File.play();
    }
}
