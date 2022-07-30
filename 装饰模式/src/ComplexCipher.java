public class ComplexCipher extends CipherDecorator{
    public ComplexCipher(Clipher clipher) {
        super(clipher);
        System.out.println("第三次加密");
    }
    public void thirdjiami(){
        System.out.println("第三次加密成功");
    }
}
