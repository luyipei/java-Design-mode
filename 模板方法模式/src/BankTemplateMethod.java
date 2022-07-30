public abstract class BankTemplateMethod {
    //银行办理业务的步骤
    //取号，办理业务，评分
    //其中办理业务有存款，取款和转账，但是他们的基本流程都一样
    public void takeNumber(){
        System.out.println("取号排队");

    }
    public abstract void transact();

    public void evaluate(){
        System.out.println("反馈评分");

    }
    public void process(){
        //流程
        this.takeNumber();
        this.transact();
        this.evaluate();

    }

}
