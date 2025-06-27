class Test extends Object{

    public static void main(String[] args) {
       int a=10;
       int b=20;
       int c=10;
       Test t1=new Test();
       Test t2=new Test();
       String s1=new String("Rahul");
       String s2="Rahul";
       System.out.println(t1.equals(t2)); //false
       System.out.println(t1 == t2);//false

       System.out.println(s1.equals(s2)); //true
       System.out.println(s1 ==s2); //false


    }
}