abstract class A{}
abstract class B{
    public void login(){
        System.out.println("Login Success");
    }
    public abstract void forgte_PWD();
}
class C extends B{
    public void forgte_PWD(){
        System.out.println("Check Mail");
    }
}
class Test{
    public static void main(String[] args) {
               C obj=new C();
               obj.login();
               obj.forgte_PWD();
    }
}