class example{
    int salary;
    example(int salary) throws IllegalArgumentException{
        if(salary<=0){
            throw new IllegalArgumentException("Salary must be greater than zero");
        }
        this.salary=salary;
        System.out.println("Salary is: "+salary);
    }
}

public class ExceptionThrows {
    public static void main(String[] args) throws Exception{  
       try{
        example e = new example(100);
       }catch(IllegalArgumentException e){
        System.out.println(e);
       }
    }
    
}
