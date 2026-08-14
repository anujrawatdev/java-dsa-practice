package JCF;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import OOPS.polymorphism;

public class JCF2 {
    // public static void main(String[] args) {
    //     Queue<Integer> q = new LinkedList<>();
    //     q.offer(10);
    //     q.offer(20);
    //     q.offer(30);

    //     System.out.println(q);

    //     System.out.println("Removing:" + q.poll());
        
    //     System.out.println(q);

    //     System.out.println("Peeking: "+ q.peek());
    // }

    // public static void main(String[] args) {
    //     Deque<Integer> q = new ArrayDeque<>();
    //     q.offer(10);
    //     q.offer(20);
    //     q.offer(30);

    //     System.out.println(q);

    //     q.offerFirst(5);
    //     q.offerLast(4);

    //     System.out.println(q);

    //     q.pollLast();
    //     System.out.println(q);
    //     q.pollFirst();
    //     System.out.println(q);

    //     System.out.println(q.peekFirst());
    //     System.out.println(q.peekLast());
    //     System.out.println(q.peek());

    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>((a,b)-> b-a );

        //default behaviour in Integers case less value integer has the highest priority.

        //maxHeap behaviour for integers more the integer value more priority.
        pq.offer(10);
        pq.offer(20);
        pq.offer(30);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);

        
    }
}

