package day3oops;
abstract class Payment2{
	 protected double amount;
	  public Payment2(double amount) {
		  this.amount=amount;
		  
	  }
	  
	  public void printReceipt() {
		  System.out.println("Payment of ₹"+amount+" processed");
	  }
	  
	  public abstract void makePayment();
	  
	  
 }


 class CreditCardpayment2 extends Payment2
 {
	  public CreditCardpayment2(double amount) {

       super(amount);
	}
	  
	  public void makePayment() {
		  System.out.println("Processing Credit card Payment...");
		  printReceipt();
	  }
 }
 class Upipayment1 extends Payment2
 {
	 public Upipayment1(double amount) {
		super(amount);
	}
	 
	 public void makePayment() {
		 System.out.println("Processing UPI payment....");
		 printReceipt();
	 }
 }
 
 
public class Packagebankexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCardpayment2 cp=new CreditCardpayment2(45000);
		cp.makePayment();
		System.out.println();
		
		Upipayment1 up= new Upipayment1 (35000);
		up.makePayment();
		
		
		

	}

}
