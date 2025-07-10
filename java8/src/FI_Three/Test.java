package FI_Three;
interface Function_One{
    public abstract  int add(int a,int b);
}
public class Test implements  Function_One {
    public  int add(int a, int b){
        return  a+b;
    }

    public static void main(String[] args) {
        Function_One obj=new Test();
        System.out.println(obj.add(10,20));
    }
}
