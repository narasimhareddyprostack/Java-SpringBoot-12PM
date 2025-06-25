public class TestOne {
    public static void main(String[] args) {
        int a=100;
        Integer b=a;//AutoBox
        Integer c= Integer.valueOf(a);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
