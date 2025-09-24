import java.util.HashMap;
import java.util.Iterator;
public class HashMapExample {
    public static void main(String[] args) {
        // Your code here
        HashMap<Integer, String> aiml = new HashMap<>();
        aiml.put(1,"AKash");
        aiml.put(2,"Astha");
        aiml.put(6,"Varun");
        aiml.put(7,"shreya");
        aiml.put(5,"shreya");

        aiml.put(3,null);
        aiml.put(4,null);
        System.out.println(aiml);
        System.out.println(" ");
        
        System.out.println("Map elements with for each loop");
        System.out.println(" ");



        System.out.println("Traversing via key");
        for(Integer i:aiml.keySet()){
            System.out.println("Key: "+i+" Value: "+aiml.get(i));
        }
         System.out.println(" ");



         System.out.println("Traversing via entry");
        for(HashMap.Entry<Integer,String> e:aiml.entrySet()){
            System.out.println("Key: "+e.getKey()+" Value: "+e.getValue());
        }
        System.out.println(" ");



        System.out.println("Traversing via iterator");
        Iterator<HashMap.Entry<Integer, String>> itr = aiml.entrySet().iterator(); 
        while(itr.hasNext()){
            HashMap.Entry<Integer, String> entry = itr.next();
            System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
        }

        
    }
}