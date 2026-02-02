/*import java.util.ArrayDeque;
import java.util.Deque;
public class deque {
    public static void main(String[] args) {

        Deque<Integer>numbers=new ArrayDeque<>();
        numbers.addFirst(21);
        numbers.addLast(42);
        numbers.add(5);
        numbers.add(15);
        numbers.add(25);
        System.out.println(numbers);
        numbers.removeFirst();
        numbers.removeLast();
        System.out.println(numbers);

    }
    
}*/

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
public class deque{
    public static void main(String[] args) {
        Deque<Integer>numbers = new  ArrayDeque<>();
        numbers.add(98);
        numbers.add(4);
        numbers.add(55);
        System.out.println(numbers);

        Iterator<Integer>itr=numbers.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}




