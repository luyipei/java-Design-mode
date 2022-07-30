public class Shares extends AbstractShares{
    //股票
    private float lastprice;
    private float nowprice;

    public Shares(float nowprice) {
        this.nowprice = nowprice;
    }
    public void updataprice(float price){
        this.lastprice=this.nowprice;
        this.nowprice=price;
    }

    @Override
    public void notice() {
        if ((this.nowprice-this.lastprice)>0)
        {
            if ((this.nowprice-this.lastprice)/this.lastprice>0.05){
                System.out.println("涨幅超过5%！");
                for (Object obs:observes){
                    ((Listener)obs).recevied();

                }
            }

            }

        else {
            if ((this.lastprice-this.nowprice)/this.lastprice>0.05){
                System.out.println("跌幅超过5%！");
                for (Object obs:observes){
                    ((Listener)obs).recevied();

                }
            }

        }


    }

}
