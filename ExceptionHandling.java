import java.util.Scanner;

public class ExceptionHandling {
  public static void main(String args[]){
    try{
      int a=10;
      int b=0;
       System.out.println(a/b);
    }
    catch(ArithmeticException){
      System.out.println("Cannot divided by Zero");

    }
    finally{
      System.out.println("Program Complete Successfully");
    }
  }
}
