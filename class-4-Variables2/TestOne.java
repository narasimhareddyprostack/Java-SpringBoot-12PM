public class Test{
    static String ename="Rahul";
    public static void main(String[] args) {
        //How to access Static variable
        //using class name, object and dictly
        Test t1=new Test();
        System.out.println(Test.ename);
        System.out.println(t1.ename);
        System.out.println(ename);
    }
}