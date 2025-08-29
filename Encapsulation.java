
import java.util.Scanner;

class EmployeeEncap{
    private int Account_balance;
    private int upi_pin=998899;
    public void setbalance(int balance){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter UPI PIN to update account balance:");
        int pin = sc.nextInt();
        if(pin==upi_pin){
            Account_balance=balance;
            System.out.println("Salary is credited.");
        }
        else{
            System.out.println("Salary not credited.");
        }
    }
     public int getAccount_balance(){
        Scanner sc=new Scanner(System.in);
        System.out.println("To know your account balance enter your upi pin");
        int pin=sc.nextInt();
        if(pin==this.upi_pin){
            System.out.println("Your account balance is: ");
            return Account_balance;
    }
        else{
            System.out.println("Wrong pin");
        }
        return -1;
    }
}


public class Encapsulation {
     public static void main(String[] args){       
        EmployeeEncap ee=new EmployeeEncap();
        ee.setbalance(50000);   
        System.out.println(ee.getAccount_balance());    
        ee.getAccount_balance();
}

}
