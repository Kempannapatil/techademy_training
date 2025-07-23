package day3oops;


//import day3oops.CreditCardpayment2;
//import day3oops.Upipayment1;

@FunctionalInterface
interface BillGenerator
{
	void generate(double amount) ;
	default void showBillFormat() {
		System.out.println("***********BILL RACEIPT**********");
	}
		static void displayHeader() {
			System.out.println("welcome to the online billing system");
		}
	
}


public class Mainappbillinginterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreditCardpayment2 ccp= new CreditCardpayment2(5000);
		ccp.makePayment();
		 
		Upipayment1 upp= new Upipayment1(1500);
		upp.makePayment();
		
		BillGenerator.displayHeader();
		
	    BillGenerator bill=(amount) ->{
		System.out.println("Amount: ₹" + amount);
		System.out.println("Thank for your payment!");

	};
   bill.showBillFormat();
   bill.generate(6500);
}
}
