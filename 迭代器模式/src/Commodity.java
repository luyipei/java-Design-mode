public class Commodity implements AbstractCommodity{
    private Object[] commodities={"面包","方便面","雪糕","奶茶","坚果","肉类"};


    @Override
    public MyIterator createcommodity() {
        return new CommodityIterator();
    }


    public class CommodityIterator implements MyIterator{
        private int currectindex=0;

        @Override
        public void setindex(int i) {
            this.currectindex=i;

        }

        @Override
        public Object currentindex() {
            return commodities[currectindex];
        }

        @Override
        public void next() {
            this.currectindex++;

        }

        @Override
        public void previous() {
            this.currectindex--;

        }

        @Override
        public boolean isLast() {
            return this.currectindex==commodities.length;
        }

        @Override
        public boolean isFirst() {
            return this.currectindex==0;
        }
    }
}
