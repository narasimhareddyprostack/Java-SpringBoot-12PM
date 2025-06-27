public class Account {
    int acc_Id;
    String acc_Name;
    int acc_Bal;

    public Account(int id,String name,int amount){
        this.acc_Id=id;
        this.acc_Name=name;
        this.acc_Bal=amount;
    }
    public boolean deposit_Amount(int amount){
        this.acc_Bal=this.acc_Bal+amount;
        return true;
    }
    public static void main(String[] args) {
       Account a1=new Account(101,"RG",5000);
       Account a2=new Account(102,"SG",50000);

       System.out.println(a1.acc_Name);
       System.out.println(a2.acc_Name);
       a1.deposit_Amount(100);
       a1.deposit_Amount(50);
       a2.deposit_Amount(10);
       System.out.println(a1.acc_Bal);
       System.out.println(a2.acc_Bal);
    }
}
