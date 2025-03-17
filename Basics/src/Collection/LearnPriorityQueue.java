package Collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args){

        // Contains min-heap DSA
        Queue<Integer> pq = new PriorityQueue<>();

        pq.offer(13);
        pq.offer(26);
        pq.offer(8);
        pq.offer(45);
        pq.offer(12);
        pq.offer(30);

        System.out.println("Priority Queue Array = "+pq);

        System.out.println(pq.poll());

        System.out.println("Array after 1st poll() = "+pq);

        System.out.println(pq.poll());

        System.out.println("Array after 2nd poll() = "+pq);

        System.out.println(pq.peek());


//      Contains Max Heap DSA

        Queue<Integer> pcq = new PriorityQueue<>(Comparator.reverseOrder());

        pcq.offer(13);
        pcq.offer(9);
        pcq.offer(30);
        pcq.offer(4);
        pcq.offer(42);
        pcq.offer(10);

        System.out.println("Comparator Array Element = "+pcq);

        System.out.println(pcq.poll());

        System.out.println(pcq.peek());
        System.out.println("Array after peek() method = "+pcq);

    }
}
