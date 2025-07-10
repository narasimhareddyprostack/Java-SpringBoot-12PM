package CF_AL_Two;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestThree {
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
       //before sorting
        System.out.println(enames);
       //after sorting
        Collections.sort(enames);

        System.out.println(enames);
       //after sorting - descening
       Collections.sort(enames,Collections.reverseOrder());
        System.out.println(enames);
    }
}
