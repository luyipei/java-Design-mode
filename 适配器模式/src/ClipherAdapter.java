public class ClipherAdapter extends DataOperator{
    private Caesar caesar;
    public ClipherAdapter(){
        caesar=new Caesar();
    }
    @Override
    public String doEncrypt(int key, String ps) {
        return caesar.doEncrypt(key, ps);
    }
    //适配器类，数据加密
}
