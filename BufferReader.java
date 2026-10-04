import java.io.*;

 class BufferReader{
   public static void main(String args[]){
       
      try{
        BufferReader br=new BufferReader( new FileReader("test.text"));
        String line;
        while((line=br.readLine()) !=null){
          System.out.println(line);
        }
        br.close();
      }
     catch(IOException e){
       System.out.println("Error Occurred");
     }
   }
}
