package CF_AL_One;

import java.util.ArrayList;

public class TestOne {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        System.out.println(al); //[]
        al.add(10);
        al.add(10);
        al.add("Rahul");
        al.add(450000.45);
        al.add(true);
        System.out.println(al);
    }
}
