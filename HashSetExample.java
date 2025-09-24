import java.util.HashSet;
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        
        // ADD METHODS
        set.add(1);
        set.add(11);
        set.add(2);
        System.out.println("HashSet 1 after additions: " + set);

        System.out.println(" ");
        
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(21);
        set2.add(22);
        set2.add(23);
        System.out.println("HashSet 2 after additions: " + set2);
        System.out.println(" ");
        
        //union - addALL, intersection- retainALL, difference- removeAll

        set.addAll(set2);//union
        System.out.println("Union: " + set);
        set.retainAll(set2);//intersection
        System.out.println("Intersection: " + set);
        set.removeAll(set2);//difference
        System.out.println("Difference: " + set);
    }
}
