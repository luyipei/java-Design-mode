import java.util.Hashtable;

public class ChatGroup extends AbstractChatroom{
    //一个聊天室中有多个成员
    private Hashtable members=new Hashtable();
    @Override
    public void register(Member member) {
        //添加成员，如果该聊天室中没有该成员的话就把这个成员加入到聊天室中
        if (!members.contains(member)){
            members.put(member.getName(),member);
            //同时设置这个成员所在的聊天室为这个
            member.setChatRoom(this);
        }

    }

    @Override
    public void sendText(String from, String to, String message) {
        //函数的功能是实现发送信息
        //因此从哈希表中按照要发送的成员的名字取出该成员
        Member member=(Member) members.get(to);
        String newMessage=message;
        //过滤不雅字符
        newMessage=message.replaceAll("日","*");
        //调用该成员的接收函数
        member.receiveText(from,newMessage);

    }

    @Override
    public void sendImage(String from, String to, String image) {
        //函数的功能是实现发送照片
        //按照成员的名字从哈希表中取出
        Member member=(Member) members.get(to);
        //判断图片大小
        if (image.length()>5){
            System.out.println("图片太大，无法发送！");
        }
        else {
            member.receiveImage(from,image);
        }


    }
}
