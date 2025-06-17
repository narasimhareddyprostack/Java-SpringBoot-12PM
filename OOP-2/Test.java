class Parent{
    public void m1(){ System.out.println("Parent Class m1 method");}
    public void m2(){ System.out.println("Parent Class m2 method");}
}
class Child extends Parent{
public void m3(){ System.out.println("Child Class m3 method");}
}
public class Test {
    public static void main(String[] args) {
        Child c2=new Parent();
    }
}
