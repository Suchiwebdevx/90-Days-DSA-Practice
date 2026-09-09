/*Create an Employee class with:

name
salary
department

Requirements:

Make variables private.
Create getters and setters for all three.
Create displayDetails().
Create an object in main().*/

package OOps;

import java.util.Scanner;

public class EmployeeSettersGetters {
	
	private String name;
	private double salary;
	private String department;
	private String getSalary;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	void displayDetails() {
		System.out.println("Name : " + name);
		System.out.println("Salary : " + salary);
		System.out.println("Department: " + department);
	}
	
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		
		EmployeeSettersGetters gs= new EmployeeSettersGetters();
		
		System.out.println("Enter Employee name ");
		String name = sc.nextLine();
		
		System.out.println("Enter Employee salary ");
		double salary = sc.nextDouble();
		
		System.out.println("Enter Employee Department ");
		String department=sc.next();
		
		//setters
		gs.setName(name);
	    gs.setSalary(salary);
	    gs.setDepartment(department);
	    
	    gs.displayDetails();
	}
	
	void displaydetails() {
		
		System.out.println("Name : " + getName());
		System.out.println("Salary : " + getSalary());
		System.out.println("Department : " + getDepartment());
	}

	
	

}
