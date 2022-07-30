public class text {
    public static void main(String[] args) {
        AbstractChatroom happychat=new ChatGroup();
        Member member1,member2,member3,member4,member5;
        member1=new DiamondMember("张三");
        member2=new DiamondMember("李四");
        member3=new DiamondMember("王五");
        member4=new CommonMember("特利迦");
        member5=new CommonMember("德凯");
        happychat.register(member1);
        happychat.register(member2);
        happychat.register(member3);
        happychat.register(member4);
        happychat.register(member5);


        member1.sendText("李四","李四，你好！");
        member2.sendText("德凯","今天星期日");
        member1.sendImage("李四","图片");
        member2.sendImage("德凯","这是一张特别大的图片");
        member5.sendImage("张三","图片");


    }
}
