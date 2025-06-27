class Employee{
   private int eid;
   //private String ename;
   public void setEid(int eid){
    this.eid=eid;
   }
   public int getEid(){
    return this.eid;
   }
}
public class Demo{
    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee();
        e1.setEid(101);
        e2.setEid(102);
        System.out.println(e1.getEid());
        System.out.println(e2.getEid());
       
    }

}