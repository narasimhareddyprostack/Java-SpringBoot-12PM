package FI_Six;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface  Predicate_Two{
    public  abstract boolean test(List numbers);
}
public class TestThree implements  Predicate_Two{
    @Override
    public boolean test(List numbers) {
        return numbers.isEmpty();
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(18,31,11,8,2015,171);
        Predicate_Two p1 = new TestThree();
        System.out.println(p1.test(numbers));
    }


}
