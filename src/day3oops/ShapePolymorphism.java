package day3oops;
class Shape{
	void draw() {
		System.out.println("Drawing a shape");
	}
	
}
class Circle extends Shape
{
	@Override
	void draw() {
		System.out.println("Drawing a circle");
	}
}

class Rectangle extends Shape
{
	@Override
	void draw() {
    System.out.println("Drawing a  rectangle");

	}
}



public class ShapePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Shape s1= new Circle();
        Shape s2=new Rectangle();
        s1.draw();
        s2.draw();
	}

}
