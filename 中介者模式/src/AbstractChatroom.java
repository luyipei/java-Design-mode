public abstract class AbstractChatroom {
    //抽象中介者类
    public abstract void register(Member member);
    public abstract void sendText(String from,String to,String message);
    public abstract void sendImage(String from,String to,String image);
}
