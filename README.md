# java-
单例模式：对某个类只能存在一个对象实例

饿汉式

1.构造器私有化，防止new这个对象

2.类的内部创建对象

3.向外暴露一个静态的公共方法

```
public class singleone {

    //私有化类
    private singleone(){

    }
    //内部创建实例
    private final static singleone intex=new singleone();

    //提供一个静态方法来返回实例
    public static singleone getsingleone(){
        return intex;
    }
}
```

优点：写法简单，在类装载的时候就完成了实例化，避免了线程同步问题

缺点：在类装载的时候就完成了实例化，没有达到lazy loading的效果，即如果从始至终都没有用过这个实例，会造成内存的浪费



懒汉式（线程不安全）

```
public class SingleOne2 {

    private static SingleOne2 index;
    public static SingleOne2 getSingleOne2(){
        if(index==null){
            index=new SingleOne2();
        }
        return index;
    }
}
```

优缺点：起到了懒加载的效果，但只能在单线程下使用

如果在多线程下，一个线程进入了if判断语句，还未来得及往下执行，另一个线程也通过了判断语句，

这时就会产生多个实例，所以多线程的环境下不可以使用这个方法

懒汉式（线程安全）

加入同步处理代码，synchronized，解决线程安全问题

优缺点：

解决了线程不安全的问题

但是效率太低，每个线程在想获得实例的时候都要进行线程排队，原本执行一次实例化就可以了，

后面的想要获取该类直接return就可以，所以这个方法效率太低

在实际开发中不推荐使用这种方式



双重检查

volatile修饰

双重检查

优缺点：进行了两次if判断的检查，这样就可以保证线程的安全

实例化代码只用执行一次，后面再访问时，if判断直接return实例化对象，也避免了反复进行方法同步



静态内部类





枚举







单例模式的缺点：

在一定程度上违背来单一职责原则，因为单例模式既充当了工厂角色，提供了工厂方法，又充当了产品角色，包含了业务方法，将产品的创建和产品本身的功能融合到一起



# 简单工厂模式

定义了创建对象的类，由这个类来封装实例化对象的行为

关注对象的创建过程，将对象的创建和使用分离，在使用时无需知道对象的创建细节

简单工厂模式包含以下几个角色

1.factory（工厂角色）

2.product（抽象产品角色）

3.concreteproduct（具体产品角色）

优缺点：

工厂类集中了所有的产品创建逻辑，一旦不能正常工作，整个系统都会受到影响

使用简单工厂会增加系统中类的个数，在一定程度上增加了系统的复杂度和理解难度

系统拓展困难，一旦添加新的产品就不得不修改工厂逻辑，在产品数量较多时，有可能会造成工厂逻辑过于复杂，不利于系统的维护和拓展

由于使用了静态工厂方法，即如果定义的时候使用的是父类，即使实例化的是子类也无法访问子类覆盖后的静态方法



适用环境：创建的对象比较少，客户端只知道传入工厂类的参数，对如何创建对象不关心



# 工厂方法模式

1.product（抽象产品）

2.concreteproduct（具体产品）

3.factory（抽象工厂）

4.concretefactory（具体工厂）

优缺点：满足了开闭原则

在添加新产品时，需要编写具体的产品类，也需要编写相应的工厂，系统中类的个数将成对增加，在一定程度上增加了系统的复杂度

# 抽象工厂模式

产品族

在抽象工厂模式中，每一个具体工厂可以生产多个具体产品

# 1.产品等级结构

产品的继承结构，如电视和海尔电视、海信电视、TCL电视等

2.产品族

同一工厂生产的产品，如海尔工厂生产的海尔电视机、海尔电冰箱、海尔空调

抽象工厂模式是所有形式的工厂模式中最为抽象和最具一般性的一种形态，抽象工厂模式与工厂方法模式最大的区别在于，工厂方法模式针对的是一个产品等级结构，而抽象方法模式面对的是多个产品登记结构

1.product（抽象产品）

2.concreteproduct（具体产品）

3.factory（抽象工厂）

4.concretefactory（具体工厂）

优缺点：

增加新的具体工厂和产品族都很方便，无需修改已有系统，符合开闭原则

在添加新的产品对象时，例如要新增加洗碗机，要对抽象工厂角色以及所有的子类都要修改，会带来非常大的不便

对开闭原则的支持呈现倾斜性



# 原型模式

1.prototype抽象原型类

2.concreteprototype具体原型类

##### 深克隆和浅克隆

浅克隆：被复制对象的所有普通成员变量都具有与原来对象相同的值，而所有的对其他对象的引用仍然指向原来的对象

深克隆：除了对象本身被复制了以外，对象包含的引用也被进行了复制

深克隆通过序列化的方式实现

将对象写到流的过程，写到流中的对象时原对象的一个拷贝，而原对象仍然存在于内存当中，序列化通过将对象写到一个流中，再从流里将其读出来，从而实现深克隆

```
//将对象写入流中
ByteArrayOutputStream bao=new ByteArrayOutputStream();
ObjectOutputStream oos=new ObjectOutputStream(bao);
oos.writeObject(this);

//将对象从流中取出
ByteArrayInputStream bis=new ByteArrayInputStream(bao.toByteArray());
ObjectInputStream ois=new ObjectInputStream(bis);
return ((Email) ois.readObject());
```

缺点：需要为每一个类配备一个克隆方法，而这个克隆方法需要对类的功能进行通盘考虑，违反了开闭原则

# 建造者模式

将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示

1.builder抽象建造者

2.concrebuilder具体建造者

3.product产品角色

4.director指挥者



首先定义出产品类

```
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
```

然后定于抽象的建造类

用来建造产品的各个组成

```
public abstract class MealBuilder {
    //抽象类，相当于建造工厂
    protected Meal meal=new Meal();
    public abstract void buildFood();
    public abstract void buildDrink();
    public Meal getMeal(){
        return meal;
    };

}
```

然后具体化这个抽象建造类

```
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
```

然后定于指挥者类（即服务员）

```
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
```

优缺点：符合开闭原则，客户端不必知道产品内部组成的细节，将产品本身和产品的构建解耦，使得相同的创建过程可以创建不同的产品对象

每一个具体建造者都相对独立，因此可以很方便的替换和增加新的建造者，符合开闭原则

如果产品之间的差异性很大，则不适合使用建造者模式

# 适配器模式

将某个类的接口转换成客户端期望的另一个接口表示

类适配器

对象适配器

接口适配器

差不多相当于目标是机器人，要使用的是Dog类中的跑函数

把机器人定义为接口型，然后定义一个适配器类，在适配器类中重写或使用Dog的跑函数



优缺点：将目标类和适配者类解耦，通过引用一个适配器类来重用现有的适配器类，而无需修改原有代码

# 提高了类的透明性和复用性



# 桥接模式

如果系统中某个类存在两个独立变化的维度，通过桥接模式可以将这两个维度分离出来，使二者可以独立拓展

将继承关系转化为关联关系，降低了类与类之间的耦合，减少了代码的编写量

1.abstraction抽象类

2.pefindabstraction扩充抽象类

3.implementor实现类接口

4.concretelmplementor具体实现类

# 装饰模式

动态地为对象增加一些额外的职责
1.component抽象构件
2.concretecomponen具体构件
3.decorator抽象装饰类
4.concretedecorator具体装饰类

# 组合模式

1.component抽象构件

2.leaf叶子构件

3.composite容器构件

4.client客户类

组合模式的关键是定义一个抽象构件类，既可以表示叶子也可以表示容器，而客户端针对该抽象构件类进行编程，无需知道他表示的是叶子还是容器，可以对其进行统一处理

# 外观模式

通过定义一个一致的接口，来屏蔽内部子系统的细节，使得调用端只需要和这个接口发生调用，而不需要关心子系统的内部细节

# 享元模式

外部状态：不能共享的内容

内部状态：可以共享的相同内容

1.flyweighr抽象享元类

2.concreteflyweight具体享元类

3.unsharedconcreteflyweight非共享具体享元类

4.flyweightfactory享元工厂类



享元模式可以极大的减少内存中对象的数量，使得相同对象或相似对象在内存中只保存一份

享元模式的外部状态相对独立，而且不会影响外部状态，使得享元对象可以在不同环境中被共享

读取外部状态使得运行时间变长



# 代理模式





# 职责链模式

将能够处理同一类请求的对象连成一条链，所提交的请求沿着链传递，链上的对象逐个判断是否有能力处理该请求，如果能则处理，如果不能则传递给下一位

1.handler抽象处理者

2.concretehandler具体处理者

在抽象处理者中定义了一个自类型的对象，用来维持一个对处理者下家的引用，以便将消息传递给下家

有处理请求和转发请求



符合开闭原则

缺点：不能保证请求一定会被接收，也有可能使系统陷入死循环



# 命令模式

命令的发布者其实是不知道具体执行命令的对象

1.command抽象命令类

2.concretecommand具体命令类

3.Invoker调用者

4.receiver接收者

系统将请求调用者和请求接收者解耦，调用者和接收者之间不直接交互

满足开闭原则

# 解释器模式

不常用的设计模式，用来描述如何构成一个简单的语言解释器

当需要开发一个新语言时可以考虑使用解释器模式

# 迭代器模式

1.iterator抽象迭代器

2.concretelterator具体迭代器

3.aggregate抽象聚合类

4.concreteAggregate具体聚合类

迭代模式首先是定义一个抽象迭代器接口，来定义要实现的一些函数

然后定义一个抽象的聚合类，来定义要实现的函数

然后定义具体的聚合类，在他的类下定义具体的的迭代器来实现功能，并且定义一个函数来返回这个迭代器

这样客户端就可以使用这个函数得到迭代器了，然后可以对迭代器进行遍历



相当于将聚合类封装起来了，然后返回了这个封装了的箱子

用户可以通过这个箱子对聚合类进行遍历



满足开闭原则和单一职责原则



# 中介者模式

用一个对象来封装一系列的对象交互

1.mediator抽象中介者

2.concretemediator具体中介者

3.colleague抽象同事类

4.concretecolleague具体同事类

中介模式可以使对象之间的关系数量急剧减少

# 备忘录模式

1.originator原发器

2.memento备忘录

3.caretaker负责人

```
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
```

负责人中含有备忘录对象，然后通过get函数得到此时手中的备忘录状态，set函数设置手中的备忘录状态

原发器部分代码

```
public Memento saveMemento(){
    return new Memento(account,password,telNo);
}
//保存当前状态
public void restoreMemenoto(Memento memento){
    this.account=memento.getAccount();
    this.password=memento.getPassword();
    this.telNo=memento.getTelNo();
}
public void show(){
    System.out.println("账号："+this.account);
    System.out.println("密码："+this.password);
    System.out.println("TelNo"+this.telNo);
}
```

其中最重要的是restore函数来恢复备忘录中的状态，和save函数来保存此时的状态





其中原发器是对软件的各种操作，包括修改信息等，然后原发器中有备忘录对象，用来记录和改变原发器的状态

# 观察者模式

当一个对象的状态发生改变时，其相应依赖对象皆得到通知并更新

1.subject目标，又称主题，被观察的对象

2.concretesubject具体目标

3.observer观察者

4.concreteobserver具体观察者

很好的实现了开闭原则

缺点：如果一个观察目标对象有很多直接和间接的观察者的话，将所有观察者都通知到会花费很多时间

如果在观察者和观察目标之间有循环依赖的话，观察目标会触发他们的循环调用而可能导致系统崩溃

观察者模式没有相应的机制让观察者知道所观察的目标对象时怎么发生变化的，而仅仅是知道目标发生了变化

# 状态模式

将对象状态从包含该状态的类中分离出来，做成一个单独的状态类

允许一个对象在其内部状态改变时改变他的行为，对象看起来似乎修改了他的类

1.context环境类，拥有状态的对象

2.stase抽象状态类

3.concretestate具体状态类

对开闭原则的支持不太友好，对于可以切换状态的状态模式，增加新的状态需要修改那些负责状态转化的源代码，否则无法切换到新增状态

# 策略模式

1.context环境类

2.strategy抽象策略类

3.concretestrategy具体策略类

环境类是需要使用算法的对象

符合开闭原则

单一职责原则

# 模板方法模式

模板方法模式是基于继承的代码复用基本技术，模板方法模式的结构和用法也是面向对象设计的核心之一

1.abstractclass抽象类

2.concreteclass具体子类

涉及步骤执行顺序时

模板方法是定义在抽象类中的，将基本的操作方法组合在一起形成了一个总算法或一个总行为

这个模板方法一般在抽象类中定义，并由子类不加以修改地完全继承下来，由于模板方法是具体方法，因此模板方法的抽象层只能是抽象类，而不是接口

钩子方法的定义

符合开闭原则

每个不同的实现都要定义一个子类，这会导致类的个数增加，系统更加庞大，设计也更加抽象，但是会更好地符合单一职责原则，使系统内聚性得到提高

# 访问者模式

对象结构存储了不同类型的元素对象，以供不同的访问者访问

同时，不同的访问者访问相同的对象也可能进行不同的操作

相同的访问者可以以不同的方式访问不同的元素，相同的元素也可以接受不同的访问者以不同访问方式访问

### 双重分派技术

在该系统中，如果需要增加一个新的访问者，只需要增加一个新的类继承抽象访问类就可以，符合开闭原则

但是如果要增加新的具体元素，则需要修改访问者的代码，包括抽象访问者的代码，违反了开闭原则

因此访问者模式对开闭原则存在倾斜性

缺点：访问者模式要求访问者对象访问并调用每一个元素对象的操作，这就意味着元素对象必须有时候暴露一些自己的内部状态和操作，破坏封装
