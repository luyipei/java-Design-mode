public interface TVIterator {
    //声明了迭代器所具有的方法
    void setChannel(int i);
    Object currentChannel();
    void next();
    void previous();
    boolean isLast();
    boolean isFirst();

}
