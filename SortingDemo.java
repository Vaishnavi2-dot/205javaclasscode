import java.util.*;
class Employee{
    int id;
    String name;
    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }
}
public int compareTo(Employee e){
    return this.id - e.id;
}


public class SortingDemo {
    public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<>();
    list.add(5);
    list.add(3);
    list.add(8);
    list.add(2);
    list.add(9);
    list.add(1);
    System.out.println("Array List is : "+list);
    Collections.sort(list);
    System.out.println("After Sorting: "+ list);

}}
