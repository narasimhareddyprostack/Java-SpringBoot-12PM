class Account{
   private int acc_Id;
   private String acc_Name;
            //+
   public int getAcc_Id() {
    return acc_Id;
   }
   public void setAcc_Id(int acc_Id) {
    this.acc_Id = acc_Id;
   }
   public String getAcc_Name() {
    return acc_Name;
   }
   public void setAcc_Name(String acc_Name) {
    this.acc_Name = acc_Name;
   }
   
   
}

public class Demo{
    public static void main(String[] args) {
       Account a1=new Account();  

       a1.setAcc_Id(101);
       a1.setAcc_Name("Rahul");

       System.out.println(a1.getAcc_Id());
       System.out.println(a1.getAcc_Name());

       Account a2=new Account();
       a2.setAcc_Id(102);
       a2.setAcc_Name("Sonai");
       System.out.println(a2.getAcc_Id());
       System.out.println(a2.getAcc_Name());
    }
}