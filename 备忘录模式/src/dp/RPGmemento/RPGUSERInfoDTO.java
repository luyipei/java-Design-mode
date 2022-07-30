package dp.RPGmemento;

public class RPGUSERInfoDTO {
    //原发器
    private float blood;
    private String name;
    private  String scene;
    private RPGMemento memento;

    public RPGUSERInfoDTO(float blood, String name, String scene) {
        this.blood = blood;
        this.name = name;
        this.scene = scene;
    }
    //set 和 get 函数

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

    //保存
    public RPGMemento saveMemento(){
        return new RPGMemento(blood,name,scene);
    }


    //恢复
    public void restoreMemento(RPGMemento memento){
        this.blood=memento.getBlood();
        this.name=memento.getName();
        this.scene=memento.getScene();
    }



    public void show(){
        System.out.println("姓名为："+name);
        System.out.println("当前血量为："+blood);
        System.out.println("当前场景为："+scene);
    }
}
