package day3oops;
class Employee{
	private String name;
	private double salary;
	
	public void setName(String n) {
		name=n;
		
	}
	public void setSalary(double s) {
		salary =s;
		
		
	}
	
	public void display() {
		System.out.println("Name: "+ name);
		System.out.println("Salary: "+ salary);
	}
}

public class Emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Employee e=new Employee();
      e.setName("Sanjeev");
      e.setSalary(12000);
     e.display();
	}

}
