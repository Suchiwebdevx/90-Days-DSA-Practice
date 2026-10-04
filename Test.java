import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter Your age : ");
    int age=sc.nextInt();
   try{
    
    if(age < 18){
      throw new ArithmeticException("Age must be 18 or above ");
    }
    System.out.println("Eligible");
  }catch(ArithmeticException e){
      System.out.println("Exception: " + e.getMessage());
  }
  sc.close();
  }
}
    
