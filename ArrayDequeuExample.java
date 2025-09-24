import java.util.ArrayDeque;
public class ArrayDequeuExample {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        
        // ADD METHODS
        deque.add("A");
        deque.addFirst("F");
        deque.addLast("L");
       
        //Add using Offer
        deque.offer("C");//adds at the end
        deque.offerFirst("First");
        deque.offerLast("Last");
        System.out.println("Deque after additions: " + deque);

        System.out.println(" ");
        //Access elements
        System.out.println("First Element: " + deque.peek());
        System.out.println("Last Element: " + deque.peekLast());
        System.out.println(" ");
        
        //Remove elements
        System.out.println("Removing elements");
        System.out.println("Removed First: "+ deque.removeFirst()); 
        System.out.println("Removed Last: "+ deque.removeLast());
        System.out.println("Removed First using poll: "+ deque.pollFirst());
        System.out.println("Removed Last using poll: "+ deque.pollLast());
        

        System.out.println(" ");

        
        System.out.println("Deque after removals: " + deque);
         
    }
}
    

