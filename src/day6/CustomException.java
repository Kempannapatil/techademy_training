package day6;

class InvalidAgeException extends Exception
{ 
	public InvalidAgeException(String message) {
	super(message);
	}
}

public class CustomException {
	
	public static void checkAge(int Age) throws InvalidAgeException{
		if(Age<18) {
			throw new InvalidAgeException("age must be 18 or greater than 18");
		}
		else {
			System.out.println("You are eligible to vote");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			checkAge(23);
			
			
			
		}
		catch(InvalidAgeException e) {
			System.out.println("Exception: "+ e.getMessage());
		}

	}

}
