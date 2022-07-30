import java.io.IOException;

public class text {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        /*
        sheep sheep1=new sheep("多例","白色","男");
        sheep sheep2= sheep1.clone();
        System.out.println(sheep1);
        System.out.println(sheep1.getName()+sheep1.getColor()+sheep1.getSex());
        System.out.println(sheep2.getName()+sheep2.getColor()+sheep2.getSex());
        int maxValue = Integer.MAX_VALUE;
        System.out.println(maxValue);

         */
        Email email,copyemail,deepcopyemail;
        email=new Email();
        copyemail=email.clone();
        System.out.println(email==copyemail);
        System.out.println(email.attachment==copyemail.attachment);
        deepcopyemail=email.deepclone();
        System.out.println(email==deepcopyemail);
        System.out.println(email.attachment==deepcopyemail.attachment);



    }

}
