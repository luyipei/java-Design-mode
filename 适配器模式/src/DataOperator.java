public abstract class DataOperator {
    //数据库操作，需要用到加密算法
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public abstract String doEncrypt(int key, String ps);
}
