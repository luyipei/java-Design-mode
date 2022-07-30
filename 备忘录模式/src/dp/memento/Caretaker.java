package dp.memento;

public class Caretaker {
    //负责人,负责保存备忘录
    private Memento memento;
    public Memento getMemento(){
        return memento;
    }
    public void setMemento(Memento memento){
        this.memento=memento;
    }
}
