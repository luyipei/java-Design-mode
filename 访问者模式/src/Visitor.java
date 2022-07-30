public abstract class Visitor {
    //访问者
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void visit(Apple apple);
    public abstract void visit(Book book);

}
