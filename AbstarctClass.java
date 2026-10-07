abstract class shape{
    
    abstract void area();
}

class circle extends shape{
    
    double r=5;

    void area(){
    double result=3.14*r*r;
    System.out.println("THE AREA OD CIRCLE IS " + result);
    
    }
    
}

 class rectangle  extends shape{
    
    double length =15;
    double breadth=12;
    
    void area(){
        System.out.println("THE AREA OF RECTANGLE IS " + (length * breadth));
    }
}

class Main{
    
    public static void main(String args[]){
        
        shape s=new circle();
         s.area();
         
        shape s1= new rectangle();
          s1.area();
    }
}
