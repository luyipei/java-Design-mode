public class SkyworthTelevsion implements Tevelision{

    //在该类中定义一个数组来存储电视剧频道
    //迭代器SkyworthIlterator作为该类的内部类，在SkyworthIlterator中实现了遍历方法
    //SkyworthTelevision作为抽象聚合类的子类实现了create方法，来返回一个具体的迭代对象
    private Object[] obj={"cctv1","cctv2","cctv3","cctv4","cctv5","cctv6","cctv7"};

    @Override
    public TVIterator createIterator() {
        return new SkyworthIlterator();
    }

    private class SkyworthIlterator implements TVIterator
    {
        private int currentIndex=0;

        @Override
        public void setChannel(int i) {
            currentIndex=i;

        }

        @Override
        public Object currentChannel() {
            return obj[currentIndex];
        }

        @Override
        public void next() {
            if (currentIndex<obj.length)
            {
                currentIndex++;
            }

        }

        @Override
        public void previous() {
            if (currentIndex>0){
                currentIndex--;
            }

        }

        @Override
        public boolean isLast() {
            return currentIndex==obj.length;
        }

        @Override
        public boolean isFirst() {
            return currentIndex==0;
        }
    }
}
