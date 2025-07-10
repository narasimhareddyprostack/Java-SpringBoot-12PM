package FI_Four;

interface  Function_Two{
    public int apply(int num);
}

public class TestTwo {
    public static void main(String[] args) {
        Function_Two  obj=num->num*num;
        System.out.println(obj.apply(10));
    }
}
