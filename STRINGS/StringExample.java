public class StringExample {
    public static void main(String[] args) {
        String name = "Vaishnavi";
        int len = name.length();
        System.out.println("Length of the string: " + len);
       //converts to uppercase
        System.out.println("Uppercase: " + name.toUpperCase());
       //converts to lowercase
        System.out.println("Lowercase: " + name.toLowerCase());
        String sub = name.substring(0, 4);//returns substring
        System.out.println("Substring: " + sub.toUpperCase());
         

        String a = "vaishnavi";
        if(name.equals(a)){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
        //matlab it is CASE SENSITIVE

        //Compare lexicographically
        if (name.compareTo(a) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
    
}
