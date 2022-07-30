public class FileLogFactory implements LogFactory{
    @Override
    public Log creatwLog() {
        System.out.println("创建文件记录");
        return new FileLog();
    }
}
