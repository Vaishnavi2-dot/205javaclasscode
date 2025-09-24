package Array;
import java.util.ArrayList;
import java.util.Collections;
public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        // System.out.println(fruits);//FIRST PRINT WAY


        // for(String s:fruits){
        //     System.out.println(s);//SECOND PRINT WAY
        // }

        // fruits.add(1,"mango");
        // System.out.println(fruits);//THIRD PRINT WAY
        // System.out.println(fruits.get(2));//FOURTH PRINT WAY
        // System.out.println(fruits.set(1,"kiwi"));//UPDATE KARNE KA TAREEKA HAI
        // System.out.println(fruits);//FIFTH PRINT WAY

        // Iterator itr = fruits.iterator();
        // while(itr.hasNext()){
        //     System.out.println(itr.next());
        // }

        System.out.println(fruits.contains("kiwi"));
        Collections.sort(fruits);
        System.out.println(fruits);
        System.out.println(Collections.binarySearch(fruits, "Grapes"));
        

    }
}
