public class text {
    public static void main(String[] args) {
        //确定套餐种类,顾客选择A套餐
        SubMealBuilderA subMealBuilderA=new SubMealBuilderA();
        //组装食物和饮品
        subMealBuilderA.buildDrink();
        subMealBuilderA.buildFood();
        KFCWaiter kfcWaiter=new KFCWaiter();
        //服务员使用这个工厂进行组装
        kfcWaiter.setMealBuilder(subMealBuilderA);
        //获得套餐
        Meal meal=kfcWaiter.construct();
        System.out.println(meal.getDrink());
        System.out.println(meal.getFood());



        //定义一个建造工厂
        MakeRoleA makeRoleA=new MakeRoleA();
        //定义一个角色创建者
        RoleMaker roleMaker=new RoleMaker();
        //角色创建者使用建造工厂来生成角色
        roleMaker.setMakeRole(makeRoleA);
        //定义角色
        //返回角色
        Role role=new Role();
        role=roleMaker.getrole();
        System.out.println(role.getSex()+role.getClothes()+role.getFace()+role.getHair());
    }
}
