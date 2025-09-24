 import java.util.PriorityQueue;

public class PriorityQueueExample{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(40);
        pq.add(50);
        System.out.println("Queue is"+pq);
        //adding using offer method---
        System.out.println("Adding using offer: "+pq.offer(25));

        System.out.println("Deleted: "+pq.poll());
        System.out.println("Deleted: "+pq.poll());
        //peek method
        System.out.println("Element on the root: "+pq.peek());
        System.out.println("Deleted: "+pq.remove());

    }
}

