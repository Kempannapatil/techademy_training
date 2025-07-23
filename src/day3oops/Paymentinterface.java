package day3oops;

interface Payment1
{
	void makePayment();
}
abstract  class Paymentinterface1 implements Payment1{
  double amount;
  Paymentinterface1(double amount){
	  this.amount=amount;
  }
  void successMessage() {
	  System.out.println("Payment is Successful "+amount);
  }
}


class  CreditPaymentProcess extends Paymentinterface1
{
	CreditPaymentProcess(double amount) {
		
		super(amount);
	}
	public void makePayment() {
		 System.out.println("creditCard payment is done....");
		 System.out.println(amount + " credited to you account");
	 }
}

class NetBankingPayment extends Paymentinterface1
{
	public NetBankingPayment(double amount) {
		// TODO Auto-generated constructor stub
		super(amount);
	}
	public void makePayment() {
		System.out.println("Netbanking payment done");
		System.out.println(amount + " credited through netbanking");
	}
}
public class Paymentinterface{
	public static void main(String[] args) {
		CreditPaymentProcess ep=new CreditPaymentProcess(340000);
		ep.makePayment();
		System.out.println();
		NetBankingPayment ep1=new NetBankingPayment(2500);
		ep1.makePayment();

	}
}

