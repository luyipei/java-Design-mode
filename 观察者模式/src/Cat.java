public class Cat extends Mysubject {
    @Override
    public void cry() {
        System.out.println("猫叫！");
        System.out.println("----------------");
        //对观察该目标的观察者进行一次遍历
        for (Object obs:observers)
        {
            ((MyObserver)obs).response();
        }

    }
}
