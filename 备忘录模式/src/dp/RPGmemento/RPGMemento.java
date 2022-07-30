package dp.RPGmemento;

public class RPGMemento {

    //备忘录
    private float blood;
    private String name;
    private  String scene;

    //构造函数


    public RPGMemento(float blood, String name, String scene) {
        this.blood = blood;
        this.name = name;
        this.scene = scene;
    }

    public float getBlood() {
        return blood;
    }

    public void setBlood(float blood) {
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }
}
