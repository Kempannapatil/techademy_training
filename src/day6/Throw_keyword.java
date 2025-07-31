package day6;

public class Throw_keyword {
//  static void  checkAge(int age) {
//	  if(age<18) {
//		  throw new ArithmeticException(" Access Denied : U r  not 18 yeals old");
//	  }
//	  else
//	  {
//		  System.out.println("Acess Granted");
//	  }
//  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
    	   int age=-1;
    	   if(age<0) {
    		   //throw is used to  throw custom error message
    		   throw new IllegalArgumentException("Age not be negative");
    	   }
    	   System.out.println("your Age: "+age);
       }
       catch(IllegalArgumentException e) {
    	   System.out.println("Exception occur: "+e.getMessage());
       }
	}

}
