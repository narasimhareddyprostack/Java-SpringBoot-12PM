class Test extends Object{
    public static void main(String[] args) {
       Test t1=new Test();
       Test t2=new Test();
       String s1=new String("Rahul");
       String s2="Rahul";

       System.out.println(s1.equals(s2)); //true
       System.out.println(s1 == s2); //false

    }
}