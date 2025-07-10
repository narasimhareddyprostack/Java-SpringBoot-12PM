package FI_Four;

interface  Function_One{
    public abstract  int squareIt(int num);
}
public class TestOne implements  Function_One{
    public  int squareIt(int num){
        return num*num;
    }

    public static void main(String[] args) {
        Function_One obj=new TestOne();
        System.out.println(obj.squareIt(10));
    }
}
