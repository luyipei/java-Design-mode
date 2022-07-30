public abstract class MealBuilder {
    //抽象类，相当于建造工厂
    protected Meal meal=new Meal();
    public abstract void buildFood();
    public abstract void buildDrink();
    public Meal getMeal(){
        return meal;
    };

}
