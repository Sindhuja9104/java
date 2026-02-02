import java.util.PriorityQueue;

public class PriorityQueue1 {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(21);
        pq.add(8);
        pq.add(11);
        pq.add(10);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);

    }
}
