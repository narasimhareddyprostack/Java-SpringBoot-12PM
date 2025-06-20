public class CA extends  Account{
    int acc_Id;
    int acc_Bal;
    static int min_Bal=10000;

    public int getAcc_Id() {
        return acc_Id;
    }

    public void setAcc_Id(int acc_Id) {
        this.acc_Id = acc_Id;
    }

    public int getAcc_Bal() {
        return acc_Bal;
    }

    public void setAcc_Bal(int acc_Bal) {
        this.acc_Bal = acc_Bal;
    }

    void cal_Bal(){
        //we have to write logic
        System.out.println(this.acc_Bal-min_Bal);
    }
}
