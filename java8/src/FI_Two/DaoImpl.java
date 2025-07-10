package FI_Two;

@FunctionalInterface
interface  Dao{
    void login();
}
public class DaoImpl {
    public static void main(String[] args) {
        Dao dao = ()->{ System.out.println("Login Success");};
        dao.login();
    }
}
