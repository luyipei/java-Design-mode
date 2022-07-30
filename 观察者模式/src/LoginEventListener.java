public interface LoginEventListener {
    //抽象类，登录事件监听器
    void validateLogin(LoginEvent event);
    //将事件作为参数传递
}
