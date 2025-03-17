package Collection;

import java.util.ArrayDeque;

public class LearnArrayDeque {

    public static void main(String[] args){
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(12);
        adq.offerLast(9);
        adq.offerFirst(46);
        adq.offer(22);

        System.out.println("Array of ArrayDeque interface = "+adq);

        System.out.println("Array element in pollLast = "+adq.pollLast());

        System.out.println("Array Element after pollLast = "+adq);

        adq.offerFirst(39);

        System.out.println("Array Deque after offerFirst element = "+adq);

        System.out.println("Array Element in pollFirst = "+adq.pollFirst());
        System.out.println("Array Deque after pollFirst = "+adq);

        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());
        System.out.println(adq.peek());
    }
}
