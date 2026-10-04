import java.io.*;

public class BufferWriter{
  public static void main(String args[]){
    try{
      BufferWriter bw=new BufferWriter(new FileWriter("Test.txt"));
      bw.write("HELLO KITTY");
      bw.newLine();
      bw.write("Revising File handling");
      bw.close();
    }
    catch(IOException e ){
System.out.println("ERROR OCCURRED"):
  }
  }
}
