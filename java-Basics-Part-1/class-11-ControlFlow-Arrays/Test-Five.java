class Test{
    public static void main(String[] args) {
      int[] eids; //declaration
      eids=new int[4];//creation
      System.out.println(eids[0]);  //0
      System.out.println(eids[1]);  //0
      System.out.println(eids[2]);  //0
      System.out.println(eids[3]);  //0
      eids[2] = 909;  //initilization st
     System.out.println(eids[0]);  //0
      System.out.println(eids[1]); //0
      System.out.println(eids[2]); //909
      System.out.println(eids[3]); //0
      
     
    }
}