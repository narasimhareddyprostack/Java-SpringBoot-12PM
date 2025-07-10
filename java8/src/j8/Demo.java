package j8;

interface Dao{
    public  abstract  void login();
    public  abstract void logout();
    //public abstract  void forgetPwd();
    public  default  void forgetPwd(){
        System.out.println("forget Pwd! link mailed");
    }
}
class DaoImpl1 implements  Dao{

    @Override
    public void login() {

    }

    @Override
    public void logout() {

    }
}
class DaoImpl2 implements  Dao{

    @Override
    public void login() {

    }

    @Override
    public void logout() {

    }
}
class DaoImpl3 implements  Dao{

    @Override
    public void login() {

    }

    @Override
    public void logout() {

    }
}
class DaoImpl4 implements  Dao{

    @Override
    public void login() {

    }

    @Override
    public void logout() {

    }
}
public class Demo {
}
