import java.util.Vector;

public class Vector_Example {
    public static void main(String[] args) {
        Vector <String> vc = new Vector<>(4);
        System.out.println(vc.capacity());
        vc.add("A");
        vc.add("B");
        vc.add("C");
        vc.add("D");
        vc.add("E");
        System.out.println(vc.capacity());
        System.out.println(vc.size());

         Vector <String> vc2 = new Vector<>();
          vc2.add("1");
        vc2.add("2");
        vc2.add("3");
         System.out.println("seconde vector is" + vc2);
         vc.addAll(vc2);//ek collection ko dusre collection me append krna
         System.out.println("After appending" + vc);

         //First Element and Last Element
         System.out.println("First Element: " + vc.firstElement());
         System.out.println("Last Element: " + vc.lastElement()); 
    }}
