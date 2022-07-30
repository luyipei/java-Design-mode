public class UserFacor {
    public static User getUser(int permission){
        if (permission==0){
            return new Employee();
        }
        else if (permission==1){
            return new Manager();
        }
        else if (permission==2)
        {
            return new Administrator();
        }
        else return null;

    }
}
