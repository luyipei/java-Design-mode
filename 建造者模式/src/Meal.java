public class Meal {
    //套餐，包括食物和饮料，不同的套餐有不同的组成部分，服务员根据顾客要求一步步装配这些组成部分，构造一份完整的套餐，返回给顾客
    private String food;
    private String drink;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
}
