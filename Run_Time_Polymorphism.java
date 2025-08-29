//Run Time Polymorphism or Dynamic Method Dispatch
//Isme yeh hota hai ki jo method parent class me hota hai wahi child class mein hota hai, na parameter change hota hai na return type

class employee{
    String Emp_name;
    void details(){
        System.out.println("  Emp ID: " + Emp_name);
    }
}
class staff extends employee{
    void details() {
        super.details();  // calls parent method
        System.out.println("Organisation: " + Emp_name);
    }
}
public class Run_Time_Polymorphism {
    public static void main(String[] args) {
        staff s = new staff();//calls the method of child class
        s.Emp_name="Vaishnavi";
        s.details();
    }
}
