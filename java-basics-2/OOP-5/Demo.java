class Account{
    String acc_Name;
    String acc_Email;
    Account(String name,String email){
        this.acc_Name=name;
        this.acc_Email=email;
    }
}
class SA extends Account{
    int acc_Id;
    double acc_Bal;
    static double min_Bal=500.00;
    SA(int id,String name,String email,double amount){
        super(name,email);
        this.acc_Id=id;
        this.acc_Bal=amount;
    }
}
public class Demo{
    public static void main(String[] args) {
        SA sa1=new SA(101,"RG","rg@gmail.com",5000.00);
        SA sa2=new SA(102,"SG","sg@gmail.com",15000.00);

        System.out.println(sa1.acc_Id);   //101
        System.out.println(sa1.acc_Name); //null
        System.out.println(sa1.acc_Email);//null
        System.out.println(sa1.acc_Bal);  //5000.00
        System.out.println(sa1.min_Bal);  //500.00
    }
}