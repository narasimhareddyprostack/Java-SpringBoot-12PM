class Test{
    public static void m1(){
        m2();
    }
    public static void m2(){
       int i=0;
        try {
            i=Integer.parseInt("prostack");
        } catch (NumberFormatException e) {
            e.printStackTrace();
           //System.out.println(e.getMessage());
           //System.out.println("Rahul Buddy! Please Learn Java");
        }
       
        System.out.println(i);
    }
    public static void main(String[] args)  {
        m1();
    }
}