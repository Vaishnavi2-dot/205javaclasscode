import java.util.LinkedHashSet;
import java.util.TreeSet;
public class linkedhashsetexample13 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(10);
        System.out.println("Linked hash set is: "+numbers);

        LinkedHashSet<Integer> number1 = new LinkedHashSet<>();
        number1.add(21);
        number1.add(12);
        number1.add(111);

        System.out.println(number1);

        TreeSet<Integer>ts = new TreeSet<>();
        ts.add(1)
;        ts.add(2);
        ts.add(3);
        System.out.println("TreeSet is: " +ts);

    }
}
