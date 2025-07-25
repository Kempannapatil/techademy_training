package day5;
 interface Calculation{
	 double operation(double a,double b);
	 default void _mul() {
		 System.out.println("Multiplication started");
	 }
 }

 class  Calc implements Calculation
 {
	@Override
	public double operation(double a, double b) {
		return  a+b;
	}
 }

 public class Interface{
	 public static void main(String[] args) {
		Calculation c=new Calc();
		c._mul();
		c.operation(200, 300);
		System.out.println(c.operation(200, 300));
	}
 }
