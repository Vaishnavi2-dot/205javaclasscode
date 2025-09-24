import java.io.*;
import java.util.Properties;


public  class PropertiesFileExample {

    public static void main(String[] args) throws IOEException {
        // Your code here
        try{
       Properties prop = new Properties();
       prop.setProperty("db.user", "Akash");
         prop.setProperty("db.password", "secret");
         FileOutputStream fos = new FileOutputStream("config.properties");
            prop.store(fos, "Database Configurations");
            System.out.println("Info has been stores in file");
            fos.close();

            Properties loadProps = new Properties();
            FileInputStream fis = new FileInputStream("config.properties");
            loadProps.load(fis);
            System.out.println("Loaded Properties:");
            fis.close();
        }
        catch(IOException e){
            System.out.println("Exception: " + e.getMessage()); 
        }  
    }
    
}
