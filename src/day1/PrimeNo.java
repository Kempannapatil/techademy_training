package day1;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n: ");
		int n =sc.nextInt();
		boolean isPrime=n>1;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i == 0) {
				isPrime=false;
				break;
				
			}
		}
		System.out.println(n+ (isPrime?" is prime":"is not prime"
				+ ""));

	}

}
