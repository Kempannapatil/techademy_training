package day2;

public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num = 83;
	        boolean isPrime = true;

	        for (int i = 2; i <= num / 2; i++) {
	            if (num % i == 0) {
	                isPrime = false;
	                break;
	            }
	        }

	        if (isPrime && num > 1)
	            System.out.println(num + " is a Prime Number");
	        else
	            System.out.println(num + " is not a Prime Number");
	    }


	

}

