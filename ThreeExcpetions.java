public class main{

public static void main(String args[]){
  try{
    int x=10/0;
  }
  catch(ArithmeticException){
    System.out.println("ArithmeticException is handled");
  }
  try{
    int[] arr={10,20,30};
    System.out.println(arr[5]);
  }
  catch(ArrayOutOfBound a){
      System.out.println("Arrayoutofbound handled");
  }
  try{
    String s=null;
      System.out.println(s.length());
  }
  catch(NullPointerException){
      System.out.println("NullPointerException handled");
  }
}
}
    
