package day1;

import java.util.Scanner;

public class Factorial {
  static   int  fact(int n) {
	  return (n<=1) ?1:n*fact(n-1);
  }
   public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the number: ");
     int num =sc.nextInt();
     System.out.println("Factorial: "+fact(num));
    
	}

}
