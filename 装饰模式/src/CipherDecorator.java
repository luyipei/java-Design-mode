public class CipherDecorator implements Clipher{
    private Clipher clipher;

    public CipherDecorator(Clipher clipher) {
        this.clipher = clipher;
    }


    @Override
    public void jiami() {
        clipher.jiami();

    }
}
