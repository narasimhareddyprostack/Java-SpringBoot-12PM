class Test{
    public static void main(String[] args) {
        int[] product_prices={75,85,65,135,25};
        int total=0;

        for (int price : product_prices) {
            total=total+price;
        }
        System.out.println(total);
    }
}