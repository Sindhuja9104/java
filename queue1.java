

import java.util.LinkedList;
import java.util.Queue;
public class queue1 {
    public static void main(String[] args) {
        Queue<String> customerQueue=new LinkedList<>();
        customerQueue.add("Alice");
        customerQueue.add("Bob");
        customerQueue.add("John");
        customerQueue.add("Alice");
        System.out.println(customerQueue);

        customerQueue.offer("Rahul");
        customerQueue.offer("Rohith");
        customerQueue.offer("Annil");
        customerQueue.offer("Ankush");

        //add or peak
        System.out.println(customerQueue.peek());

        //remove or poll
        customerQueue.poll();
        customerQueue.poll();
        System.out.println(customerQueue);
    }
    
}


/*import java.util.PriorityQueue;
import java.util.LinkedList;
public class queue1 {
    public static void main(String[] args){
        PriorityQueue<Integer> numbers =new PriorityQueue<>();
        numbers.add(5);
        

        numbers.offer(100);
        numbers.offer(12);
        numbers.offer(56);
        numbers.offer(1);
        System.out.println(numbers);
        while(numbers.isEmpty()){
            System.out.println("polling:" + numbers.poll());

        }
    }

}*/


