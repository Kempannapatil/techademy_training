package day4;
interface Calculator{
	double add(double a,double b);
}
public class LambdaCalculator {

	public static void main(String[] args) {
		
		
		/// syntax for lamda expression in java (operator list)->body(login
		 Calculator addition =  (a,b) -> {
				System.out.println("addition");
				double result=a+b;
				System.out.println("result: "+result);
				return result;
			};
			
		 Calculator substraction = (a,b)->a-b;
		 double a=200,b=100;
		 addition.add(a, b);
		 System.out.println("result :"+substraction.add(a,b));
	}

}
