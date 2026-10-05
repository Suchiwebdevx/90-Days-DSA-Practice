public class ExceptionDemo{
 public static void main(String args[]){
   try{
     int a=10;
     int b=0;
     System.out.println(a/b);
   }
   catch(ArithmeticException e){
     System.out.println("Cannot be divided by zero");
   }
   finally{
     System.out.println("PROGRAM COMPLETED");
   }
 }
}
