package CF_AL_One;

import java.util.ArrayList;
import java.util.Iterator;

public class TestFive {
    public static void main(String[] args) {
        ArrayList<String> enames=new ArrayList<String>();
        enames.add("Rahul Gandhi");
        enames.add("Sonia");
        enames.add("Priya");
        enames.add("N Modi");
        enames.add("Amith");
        System.out.println(enames);
        //iterating using - iterator() method
        Iterator itr=enames.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
