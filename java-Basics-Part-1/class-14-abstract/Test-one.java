abstract class A{}
class B{}

public class Test{
    public static void main(String[] args) {
        B b=new B();
        System.out.println(b); //address of obj
        new A();//we cant create object for abstract classes
    }
}