abstract class College{
    abstract void register();
    abstract void Infrastucture();
    abstract void Students();
    abstract void Staff();
    void medicalFaculty(){
        System.out.println("Medical Faculty is available");
    }}
    class KIETT extends College{
        void register(){
            System.out.println("Registration is open");
        }
        void Infrastucture(){
            System.out.println("Good Infrastucture");
        }
        void Students(){
            System.out.println("Many Students");
        }
        void Staff(){
            System.out.println("Many Staff");
        }
        void medicalFaculty(){

            System.out.println("KIET has it's own hospital inside campus");
        }
    }


public class AbstractExample {
    public static void main(String[] args) {
        College cg ;
        cg = new KIETT();
        cg.register();
        cg.Infrastucture();
        cg.Students();
        cg.Staff();
        cg.medicalFaculty();

    }
    
}
