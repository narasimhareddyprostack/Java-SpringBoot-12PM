class Test{
    int a;         //instance  var
    static int b;  //staic var
    public static void main(String[] args) {
    int c;         //local var
    Test t1=new Test();
    System.out.println(t1.a);  //0
    System.out.println(b);     //0
    }
}