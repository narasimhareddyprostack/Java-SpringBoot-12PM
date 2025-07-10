package CF_LL_One;

import java.util.*;

public class TestOne {
    public static void main(String[] args) {
        LinkedList<Integer> numbers;
        numbers=new LinkedList<Integer>(Arrays.asList(70,80,18,7));
        System.out.println(numbers);
        //Iterate Linked List using for,while,do-while,forEach and iterator
        int i=0;
        while(i<=numbers.size()-1){
            System.out.println(numbers.get(i));
            i++;
        }
        System.out.println("*****");
        for (Integer num:numbers) {
            System.out.println(num);
        }
        System.out.println("*****");
        Iterator itr=numbers.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //how to sort LinkedList elmements - using Collctions.sort()
        //Collections.sort(numbers);
        Collections.sort(numbers,Collections.reverseOrder());
        System.out.println(numbers);
        numbers.addFirst(15);
        numbers.addLast(100);
        System.out.println(numbers);
    }
}
