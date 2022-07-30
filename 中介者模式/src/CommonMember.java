public class CommonMember extends Member{
    public CommonMember(String name) {
        super(name);
    }

    @Override
    public void sendText(String to, String message) {
        System.out.println("普通成员发送消息：");
        chatroom.sendText(name,to,message);

    }

    @Override
    public void sendImage(String to, String image) {
        System.out.println("普通成员不能发送图片！");

    }
}
