/*Create a Student class with:

name
age
marks

Requirements:

Make all variables private.
Create getters and setters.
Create a displayDetails() method.
Create an object in main().
Set the values using setters.
Display them using getters.*/


package OOps;

import java.util.Scanner;

public class StudentDetailsGettersSetters {

	private String name;
	private int age;
	private int marks;
	
	
	//setters and getters
	
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	public void setage(int age) {
		this.age=age;
	}
	public int getage() {
		return age;
	}
	public void setmarks(int marks) {
		this.marks=marks;
	}
	public int getmarks() {
		return marks;
	}
	void displaydetails() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Marks : " + marks);
	}
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		
		StudentDetailsGettersSetters gs= new StudentDetailsGettersSetters();
		
		System.out.println("Enter Student Name : ");
		String name= sc.nextLine();
		
		System.out.println("Enter Student Age : ");
		int age = sc.nextInt();
		
		System.out.println("Enter Student Marks : ");
		int marks=sc.nextInt();
		
	 //setters to set values provided by the users
		
		gs.setname(name);
		gs.setage(age);
		gs.setmarks(marks);
		
		gs.displaydetails();	
	}
	void displaydetails1() {
	  System.out.println("Name : " + getname());
	  System.out.println("Age : " + getage());
	  System.out.println("Marks : " + getmarks());
	  
	}
	  
	
}