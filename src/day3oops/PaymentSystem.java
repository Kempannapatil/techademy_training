package day3oops;

abstract class Payments
{
	double amount;
	public Payments(double amount) {
		this.amount=amount;
	}
	
	abstract void makePayment();
	
	void showSuccessMessage() {
		System.out.println("Payment Successful. "+amount);
	}
}

class CreditCardPayment1 extends Payments
{
	 CreditCardPayment1(double amount) {
		super(amount);
	}
	
	void makePayment() {
		System.out.println("Credit card payment is done..");
		System.out.println("account credited "+ amount);
	}
}

class UpiPayement extends Payments
{
	public UpiPayement(double amount) {
		super(amount);
	}
	
	void  makePayment() {
		System.out.println("Upi payment is done..");
		System.out.println("payment is successful  of rupees: "+amount);
	}
}
public class PaymentSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payments py=new CreditCardPayment1(50000);
		py.makePayment();
		System.out.println();
		Payments py1=new UpiPayement (50000);
		py1.makePayment();

	}

}
