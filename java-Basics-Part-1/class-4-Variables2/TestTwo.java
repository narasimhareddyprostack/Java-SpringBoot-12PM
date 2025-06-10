class Test{
    int a=100;
    int b=200;
    static int c=300;
    public static void main(String[] args) {
     Test t1=new Test();
     System.out.println(t1.a+t1.b+c); //600
     Test t2=new Test();
     System.out.println(t2.a+t2.b+t2.c);//600
     System.out.println(t1.a+t2.b+Test.c); //600
     //update variable
     t1.a=11;
     t2.b=22;
     Test.c=33;
     System.out.println(t1.a+t2.a);//111
     System.out.println(t1.a+t2.b+c);//66
    }
}