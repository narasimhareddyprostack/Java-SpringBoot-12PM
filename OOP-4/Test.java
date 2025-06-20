class Test{
    int a;
    Test(int a){
        this.a=a;
        System.out.println("constructor is special method");
    }
    public static void main(String[] args) {
        Test t1=new Test(10);
        Test t2=new Test(20);
        System.out.println(t1.a);
        System.out.println(t2.a);
    }
}

