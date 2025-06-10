public class Employee{
    int a=100;
    int b=200;
    public static void main(String[] args) {
        //System.out.println(a);
        Employee e1=new Employee();
        System.out.println(e1);//Employee@2c7b84de
        System.out.println(e1.a); //100
        System.out.println(e1.b); //200
    }
}