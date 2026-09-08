/*Create a MobilePhone class with:

Variables:

brand
model
price

Methods:

displayDetails()
makeCall()*/

package OOps;

public class MobilePhoneCheck {
	
	String brand;
	String model;
	double price;
	
	
	void displayDetails() {
		System.out.println("Brand : " + brand);
		System.out.println("Model : " + model);
		System.out.println("Price : " + price);
	}
	
	void makecalls() {
		
		System.out.println("Mobile is accessible to take any calls");
	}
	
	public static void main(String args[]) {
		
		MobilePhoneCheck m = new MobilePhoneCheck();
		
		m.brand="SAMSUNG";
		m.model="S27";
		m.price=12000;
		
		m.displayDetails();
		
      	m.makecalls();
		
	}

}
