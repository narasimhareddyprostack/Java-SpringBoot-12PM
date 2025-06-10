class Test{
    public static void main(String[] args) {
     
     int[] prices={75,175,275,375,475,575,676,875};
     for (int price : prices) {

      if(price>=500)
      break;   //come out from loop
      System.out.println(price);
     }

    }

}
