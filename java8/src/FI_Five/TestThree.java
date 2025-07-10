package FI_Five;

import java.util.function.Predicate;

public class TestThree {
    public static void main(String[] args) {

        Predicate<String> obj=name->name.length()>5;

        System.out.println(obj.test("Rahul Gandhi"));
        System.out.println(obj.test("vj"));
    }
}
