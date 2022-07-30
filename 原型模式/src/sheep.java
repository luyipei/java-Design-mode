public class sheep implements Cloneable{
    String name;
    String color;
    String sex;

    public sheep(String name, String color, String sex) {
        this.name = name;
        this.color = color;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    //克隆该实例，重写克隆方法
    protected sheep clone() throws CloneNotSupportedException {
        sheep sheep1 = null;
        try {
            sheep1=(sheep) super.clone();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return sheep1;
    }
}
