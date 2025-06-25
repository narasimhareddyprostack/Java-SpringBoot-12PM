class Emp{}
public class TestTwo {
    public static void main(String[] args) {
        int a=100;
        
        Integer b=a;//Auto Boxing
        //Integer b=Integer.valueOf(a);

        int c=b;//Unboxing
        //int c=b.intValue();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
