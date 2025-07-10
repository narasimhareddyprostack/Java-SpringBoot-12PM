package CF_AL_Two;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class TestTwo {
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
        //enames.remove("Rahul");
        //enames.removeAll(unames);
        enames.clear();
        System.out.println(enames);
    }
}
