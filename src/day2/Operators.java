package day2;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a=10;//
   int b=3; // assignment operator
   System.out.println(a+b);//arithmetic operator
   System.out.println(a == b); // compartion operators
   System.out.println(a > 0 && b > 0);  // != , ==,  >=, comparision operator
   int c= a+b;
     System.out.println(c);
     System.out.println(c--);//decrement operator
     System.out.println(c++);// increment operators
     System.out.println(++c);
     // logical  AND operators
     int x=10;
     System.out.println(x>5 && x<20);
     
     // logical OR operator
     
     int y=5;
     System.out.println(y>6 || y<4);
     
  //   logical not operator
     System.out.println(!(x>5 && x<20));
     
     System.out.println(!(y>6 || y<4));
     
	}

}
