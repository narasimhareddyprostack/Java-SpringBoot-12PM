package FI_ALL;

import java.util.function.Supplier;
@FunctionalInterface
interface Supplier_One{
    public abstract  String get();
}
public class TestOne {
    public static void main(String[] args) {
        //Supplier<String> s1=()->"Rahul Gandhi";
        Supplier<String> s1=()->{return "Rahul Gandhi";};
        Supplier_One s2=()->{return "Sonia Gandhi";};

        System.out.println(s1.get());
        System.out.println(s2.get());
    }
}
