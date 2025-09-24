
import java.util.Hashtable;
public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1, "A");
        ht.put(2, "B");
        ht.put(3, "C");
        System.out.println("Hashtable: " + ht);
        System.out.println("Value for key 2: " + ht.get(2));
        System.out.println(ht.putIfAbsent(4, "Vaishnavi"));

    }
}
