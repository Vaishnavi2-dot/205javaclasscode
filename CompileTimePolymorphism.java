//compile time polymorphism is also known as static polymorphism or method overloading
//it is a process of defining multiple methods with the same name but different parameters in the same class
//it is resolved during compile time
class Employee{
    String Emp_name;
    void empDetails(){
        System.out.println("Employee Name: "+Emp_name);
    }
    int Emp_id;
     void empDetails(int id){
        System.out.println("Employee ID: "+Emp_id);
    }
    String Org;
    int Salary;
        void empDetails(String org, int sal){
            System.out.println("Organisation: "+Org +""+"Salary: "+Salary);
        }
         void empDetails(int sal,String org){
            System.out.println("Order changed");
            System.out.println("Organisation: "+Org+" "+"Salary: "+Salary);
        }//yaha pe order change karne se bhi method overloading ho jata hai

}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.Emp_name="Vaishnavi";
        e.empDetails();
        e.empDetails(205);
        e.empDetails("KIET", 50000);
        e.empDetails(50000, "KIET");
    
}}
