package CF_AL_Two;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class TestOne {
    public static void main(String[] args) {
       Collection<String> unames=new ArrayList<String>();
        unames.add("Rahul");
        unames.add("Sonia");
       List<String> enames=new ArrayList<String>();
       enames.add("Rahul");
       enames.add("Sonia");
       enames.add("Priyanka");
       enames.add("Modi");
       enames.add("Amith");
        System.out.println(unames);
        System.out.println(enames);
        //iterate using iterator
        Iterator itr=enames.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        //read -methods
        System.out.println(enames.size());//5
        System.out.println(enames.isEmpty());//false
        System.out.println(enames.contains("Rajni"));//false
        System.out.println(enames.containsAll(unames));//true
        //update
        enames.set(1,"Sonia Gandhi");
        System.out.println(enames);
    }
}
