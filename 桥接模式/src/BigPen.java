public class BigPen extends Pen{
    @Override
    public void draw(String name) {
        String penType="大号毛笔";
        this.color.bepaint(penType,name);
    }
}
