public class DatabaseLogFactory implements LogFactory{
    @Override
    public Log creatwLog() {
        System.out.println("创建数据库记录！");
        return new DatabaseLog();
    }
}
