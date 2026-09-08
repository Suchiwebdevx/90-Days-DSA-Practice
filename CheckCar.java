/*Create a Car class with:

Variables:

brand
model
price

Methods:

displayDetails()
startCar()*/

package OOps;

public class CheckCar {
	
	String brand;
	String model;
	double price;
	
	void displayDetails() {
		System.out.println("Brand:" + brand);
		System.out.println("Model: " + model);
		System.out.println("Price: " + price);
	}
		
		void startCar() {
			System.out.println("Car Started ");
		}
	
	public static void main(String args[]) {
		
		CheckCar c =new CheckCar();
		
		c.brand="TOYOTA";
		c.model="CAMRY";
		c.price=2500000;
		
		c.displayDetails();
		c.startCar();
		
		
	}
	}
