public abstract class Pen {
    protected Color color;
    public void getColor(Color color){
        this.color=color;
    }
    public abstract void draw(String name);
}
