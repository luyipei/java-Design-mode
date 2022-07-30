public class WindowsVersion implements OperatingSystemVersion{
    @Override
    public void decode(String fileType) {
        //在xx操作系统下解码xx文件
        //xx文件播放
        System.out.println("在Windows系统下解码"+fileType+"文件");

    }

}
