
import java.util.LinkedList;
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> employees = new LinkedList<>();
                          // ADD METHODS
        employees.add("A");
        employees.add(1,"B");
       employees.addFirst("C");
       employees.addLast("D");
       System.out.println(employees);

                        //ACCESS METHODS
         System.out.println("Get First Element: " + employees.getFirst());
            System.out.println("Get Last Element: " + employees.getLast());
            System.out.println("Get index 2: "+employees.get(2));
    

                        //REMOVE METHODS
        employees.remove(); //removes the first element
        employees.remove("C");
        employees.remove(1);
        employees.removeLast();
        employees.removeFirst();
        System.out.println(employees);
        
        //SEARCH METHODS
        employees.add("A");
        employees.add("B");
        employees.add("C");
        employees.add("D");
        employees.add("E");
        System.out.println("Index of A: "+employees.contains("A"));
        System.out.println("Index of A: "+employees.indexOf("A"));
        System.out.println("Index of Z: "+employees.lastIndexOf("Z"));
    }

}
