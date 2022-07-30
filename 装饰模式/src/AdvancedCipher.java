public class AdvancedCipher extends CipherDecorator{
    public AdvancedCipher(Clipher clipher){
        super(clipher);
        System.out.println("第二次加密");
    }
    public void secondjiami(){
        System.out.println("第二次加密成功");
    }


}
