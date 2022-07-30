public class SubMealBuilderA extends MealBuilder{
    //具体的套餐组装
    @Override
    public void buildFood() {
        meal.setFood("一个鸡腿堡");

    }

    @Override
    public void buildDrink() {
        meal.setDrink("一杯可乐");

    }
}
