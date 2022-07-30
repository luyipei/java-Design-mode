import java.util.HashMap;

public class test {
    public static void main(String[] args) {
        MyElement ob1,ob2,ob3,ob4,ob5;
        Plate plate1,plate2,plate3;

        ob1=new Apple();
        ob2=new Pear();
        //第一个盘子中放入ob1和ob2
        plate1=new Plate();
        plate1.add(ob1);
        plate1.add(ob2);

        ob3=new Banana();
        ob4=new Banana();
        plate2=new Plate();
        //将ob3和ob4放入第二个盘子中
        plate2.add(ob3);
        plate2.add(ob4);
        ob5=new Apple();
        plate3=new Plate();
        //将两个小盘子放入大盘子中
        plate3.add(plate1);
        plate1.add(plate2);
        plate1.add(ob5);

        plate1.eat();




        //练习2
        AntiVirus antiVirus1,antiVirus2,antiVirus3,antiVirus4,antiVirus5;
        Folder folder1,folder2,folder3;
        antiVirus1=new TextFile();
        antiVirus2=new ImageFile();
        antiVirus3=new VideoFILE();
        folder1=new Folder();
        folder1.add(antiVirus1);
        folder1.add(antiVirus2);
        folder1.add(antiVirus3);
        folder1.killVirus();
        antiVirus4=new TextFile();
        antiVirus5=new ImageFile();
        folder2=new Folder();
        folder3=new Folder();
        folder3.add(antiVirus4);
        folder2.add(antiVirus5);
        folder1.add(folder3);
        folder1.add(folder2);
        folder1.killVirus();

    }

}
