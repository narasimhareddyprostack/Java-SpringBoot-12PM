class Test extends Object{
    public static void main(String[] args) {
        Test t1=new Test();
        Test t2=new Test();
        System.out.println(t1);
        System.out.println(t2.toString());
        
        System.out.println(t1.equals(t2)); //false
        System.out.println(t1 ==t2); //false
    }
}