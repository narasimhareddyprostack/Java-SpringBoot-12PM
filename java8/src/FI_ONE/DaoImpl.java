package FI_ONE;

import java.beans.JavaBean;

@FunctionalInterface
interface Dao{
    public abstract  void login();
    //public abstract void login()
}
public class DaoImpl implements  Dao{
    public  void login(){
        System.out.println("Login Success");
    }
    public static void main(String[] args) {
        Dao dao = new DaoImpl();
        dao.login();
    }
}
