package day3oops;
class Vehicle{
	void start() {
		System.out.println("vehicle started");
	}
}

class Car extends Vehicle{
	void drive() {
		System.out.println("car is driving");
	}
}
public class InheritanceOop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Car c=new Car();
      c.start();
      c.drive();
	}

}
