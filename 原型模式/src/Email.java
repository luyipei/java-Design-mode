import java.io.*;

public class Email implements Cloneable,Serializable{
    Attachment attachment=null;
    public Email() {
        this.attachment=new Attachment();

    }
    public void display(){
        System.out.println("查看邮件！");

    }

    @Override
    protected Email clone() throws CloneNotSupportedException {
        Email email = null;
        try {
            email=(Email) super.clone();


        } catch (Exception e) {
            e.printStackTrace();
        }
        return email;
    }
    public Email deepclone() throws IOException, ClassNotFoundException {
        //将对象写入流中
        ByteArrayOutputStream bao=new ByteArrayOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(bao);
        oos.writeObject(this);

        //将对象从流中取出
        ByteArrayInputStream bis=new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois=new ObjectInputStream(bis);
        return ((Email) ois.readObject());

    }

    public Attachment getAttachment(){
        return this.attachment;
    }

}
