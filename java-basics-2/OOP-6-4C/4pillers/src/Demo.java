public class Demo {
    public static void main(String[] args) {
        SA sa1=new SA();
        sa1.setAcc_Id(101);
        sa1.setAcc_Name("Rahul");
        sa1.setAcc_Email("rg@gmail.com");
        sa1.setAcc_Bal(5600);
        //sa1.cal_Bal();

        CA ca1=new CA();
        ca1.setAcc_Id(102);
        ca1.setAcc_Name("Sonia");
        ca1.setAcc_Email("sg@gmail.com");
        ca1.setAcc_Bal(20000);
        //ca1.cal_Bal();
        AccService.getService(sa1);
        AccService.getService(ca1);
    }
}
