public class UnixVersion implements OperatingSystemVersion{
    @Override
    public void decode(String fileType) {
        System.out.println("在Windows系统下解码"+fileType+"文件");

    }
}
