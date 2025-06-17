class Account{
    public String toString(){
        return "Rajini Kanth";
    }
}

public class Demo{
    public static void main(String[] args) {
        Account a1=new Account();
        Account a2=new Account();
        Account a3=new Account();
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
    }
}