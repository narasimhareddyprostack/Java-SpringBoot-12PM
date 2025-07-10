package FI_Three;

interface  Function_Two{
    public abstract int add(int a,int b);
}

public class TestOne {
    public static void main(String[] args) {
        Function_Two obj=(a,b)->a+b;
        System.out.println(obj.add(10,20));
    }
}
