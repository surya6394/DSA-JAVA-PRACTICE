package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args){

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);


        System.out.println(queue);

        System.out.println(queue.poll());
        queue.poll();
        queue.poll();
        queue.poll();
//        queue.remove();  // It is an alternative of poll() method but If it is getting null array
//        than it gives and Exception error but poll does not give error.
        System.out.println(queue);

        System.out.println(queue.peek());
//        System.out.println(queue.element()); // Alternative of peek() method
//        gives Exception error if array is empty.

        queue.add(70); // Alternative of offer() method, will give error if task nat completed.
        queue.add(80);
        System.out.println("The Added element of this array = "+queue);
    }
}
