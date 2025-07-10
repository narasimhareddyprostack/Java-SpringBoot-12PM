package CF_HS_One;

import java.util.HashSet;

public class TestOne {
    public static void main(String[] args) {
        HashSet eids=new HashSet();
        eids.add(101);
        eids.add(101);
        eids.add(102);
        eids.add(102);
        eids.add(103);
        eids.add("Rahul");
        eids.add(null);
        System.out.println(eids);

        for (Object eid:eids) {
            System.out.println(eid);
        }
    }
}
