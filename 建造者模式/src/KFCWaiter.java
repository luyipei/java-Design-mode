public class KFCWaiter {
    //服务员根据要求组装套餐
    private MealBuilder mb;
    public void setMealBuilder(MealBuilder mb){
        this.mb=mb;

    }
    public Meal construct(){

        mb.buildFood();
        mb.buildDrink();
        return mb.getMeal();
    }
}
