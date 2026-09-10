package OOps;

class Employee {

    String name;
    double monthlySalary;

    Employee(String name, double monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    double calculateYearlySalary() {
        return monthlySalary * 12;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Monthly Salary: " + monthlySalary);
        System.out.println("Yearly Salary: " + calculateYearlySalary());
    }
}

public class EmployeeMonthlysalary {

    public static void main(String[] args) {

        Employee e1 = new Employee("Suchi", 30000);

        e1.displayDetails();
    }
}