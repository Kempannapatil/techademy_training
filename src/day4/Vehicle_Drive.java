package day4;

abstract class Vehicle_Drive {
   abstract void speed() ;
   abstract void brand();
}

class Car extends  Vehicle_Drive
{
	void speed() {
		System.out.println("speed of the car is : 30kmph");
	}
	void brand() {
		System.out.println("brand is: tata");
	}
}
 


