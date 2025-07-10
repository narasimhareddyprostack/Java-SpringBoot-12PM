public class Test{
    public static void main(String[] args) {
        System.out.println("GM");

        int[] eids ={10,102,103};
        //index      0   1   2
        System.out.println(eids[0]);
        try{
            System.out.println(eids[10]);//AIOBException
        }
        catch(Exception e){
            //System.out.println(eids[1]);
            System.out.println(e.getMessage());
            System.out.println(e);
        }
        
        System.out.println(eids[2]);
        System.out.println(eids[2]);

    }
}