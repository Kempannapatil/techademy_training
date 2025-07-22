package day3oops;
abstract class Employeee{
    String name;
    int empId;

    public Employeee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    // Abstract method
    abstract double calculateSalary();

    // Common method
    public void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
    }
}

class FullTimeEmployee extends Employeee {
    double monthlySalary;

    public FullTimeEmployee(String name, int empId, double monthlySalary) {
        super(name, empId);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employeee {
    int hoursWorked;
    double ratePerHour;

    public PartTimeEmployee(String name, int empId, int hoursWorked, double ratePerHour) {
        super(name, empId);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * ratePerHour;
    }
}


public class Employeepayroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Employeee e1 = new FullTimeEmployee("Chetan", 101, 50000);
        Employeee e2 = new PartTimeEmployee("Gagan", 102, 80, 300);

        e1.display();
        System.out.println("Salary: ₹" + e1.calculateSalary());

        System.out.println();
}

}
