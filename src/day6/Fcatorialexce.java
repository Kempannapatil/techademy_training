package day6;

import java.util.Scanner;

public class Fcatorialexce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     try {
         System.out.print("Enter a number: ");
         int num = sc.nextInt();

         if (num < 0) {
             throw new RuntimeException("Enter a non negative value");
         }

         long fact = 1;
         for (int i = 1; i <= num; i++) {
             fact *= i;
         }

         System.out.println("Factorial of " + num + " is: " + fact);
     } catch (Exception e) {
         System.out.println("Error: " + e.getMessage());
     }
 }

     
     
	}


