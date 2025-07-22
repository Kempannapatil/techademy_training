package day1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the first number");
      double num1=sc.nextDouble();
      
      System.out.println("enter the second number");
      double num2=sc.nextDouble();
      double sum=num1+num2;
      double difference=num1-num2;
      double product= num1*num2;
      double quotient=0;
      if(num2!=0) {
    	  quotient=num1/num2;
    	  
      }
      else {
    	  System.out.println("division by zero in not allowed");
      }
      
      System.out.println("\nResults");
      System.out.println("Addition: "+ sum);
      System.out.println("Difference: "+ difference);
      System.out.println("Multiplication: "+ product);
      if(num2!=0) {
    	  System.out.println("Division: "+ quotient);
      }
      sc.close();
	}

}
