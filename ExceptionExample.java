public class ExceptionExample {
   public ExceptionExample() {
   }

   public static void main(String[] var0) {
      System.out.println(1);
      System.out.println(2);
      System.out.println(3);
      System.out.println(4);

      try {
         System.out.println(100 / 0);
      } catch (Exception var2) {
         System.out.println(var2);
      }

      System.out.println(5);
      System.out.println(6);
   }
}