import java.io.FileReader;
import java.io.IOException;

class ReadDemo{
  Public static void main(String args[]){

  try{
    FileReader reader=new FileReader("test.txt");
    int ch;
    while((ch=reader.read())!=-1){
      System.out.println((char)ch);
    }
    reader.close();
  }
    catch(IOException e){
      System.out.println("ERROR OCCURRED");
    }
  }
}
