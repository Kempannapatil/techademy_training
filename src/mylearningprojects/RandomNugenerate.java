package mylearningprojects;

import java.util.Random;

public class RandomNugenerate {

	public static long  longGenerate() {
		Random r=new Random();
		long min=1000000000L;
		long max=9999999999L;
		
		long long10digit=min+((long) (r.nextDouble()* (max-min+1)));
		return long10digit;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		long res=longGenerate();
		System.out.println("Random 10 digit number: "+res);
	}

}
