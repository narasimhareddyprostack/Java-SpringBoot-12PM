package CF_AL_One;

import java.util.ArrayList;

public class TestFour {
    public static void main(String[] args) {
        ArrayList<String> enames=new ArrayList<String>();
        enames.add("Rahul Gandhi");
        enames.add("Sonia");
        enames.add("Priya");
        enames.add("N Modi");
        enames.add("Amith");
        System.out.println(enames);
        //using for loop
        for(int i=0;i<=enames.size()-1;i++){
            System.out.println(enames.get(i));
        }
        //using while loop
        int i=0;
        while (i<=enames.size()-1){
            System.out.println(enames.get(i));
            i++;
        }
        i=0;
        //uisng do while loop
        do {
            System.out.println(enames.get(i));
            i++;
        }while (i<=enames.size()-1);
        //using foreach
        for (String ename:enames) {
            System.out.println(ename);
        }
    }
}
