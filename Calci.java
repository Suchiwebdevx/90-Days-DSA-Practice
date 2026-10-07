interface calci{
  void Calculate();
}

interface Add{
  void answer();
}

class result implemets calci,add{
  void Calculate(){
    System.out.println("WElcome to Calculator");
  }
  void answer(){
    System.out.println("The result of addition is : ");
  }

class main{
  public static void main(String args[]){
    result r = new result();
    r.Calculator();
    r.answer():
      }
}
