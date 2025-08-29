interface Institute{
    void register();
    void Infrastucture();
    void Students();
    void Staff();
    //by default all these methods are public and abstract
    static void staticConcrete(){
        System.out.println("Static Concrete method inside interface.");
    }
    default void defaultConcrete(){
        privateConcrete();
        System.out.println("Default Concrete method inside interface.");
    }
    private void privateConcrete(){
        System.out.println("Private Concrete method inside interface.");
    }
}
    class ABES implements  Institute{
        public void register(){
            System.out.println("Registration is open");
        }
        public void Infrastucture(){
            System.out.println("Good Infrastucture");
        }
        public void Students(){
            System.out.println("Many Students");
        }
        public void Staff(){
            System.out.println("Many Staff");
        }
    }



public class InterfaceExample {
    public static void main(String[] args) {
        Institute ii; 
        ii = new ABES();
        ii.register();
        ii.Infrastucture();
        ii.Students();
        ii.Staff();
        Institute.staticConcrete(); //will be called using interface name directly without creating object
        ii.defaultConcrete();

    }
    
}
