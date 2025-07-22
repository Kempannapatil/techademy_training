package day3oops;

class BankAccount{
	private String accountHolder;
	private double balance;
	
	public BankAccount(String accountHolder,int balance) {
		this.accountHolder=accountHolder;
		this.balance=balance;
	}
	public void deposit(double amount) {
		balance = balance+amount;
		System.out.println(amount + "deposited.New Balance: "+ balance);
	}
	
	public void withdraw(double amount) {
		if(amount>balance) {
			System.out.println("insufficient balanace.");
		}
		else {
			balance=balance-amount;
			System.out.println(amount + "withdrawan. Remaining Balance: "+balance);
		}    
	}
	
	public void displayDetails() {
		System.out.println("Account holder:"+accountHolder);
		System.out.println(("Balance:"+ balance));
	}
}
public class Oops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      BankAccount b=new BankAccount ("Sanjeev",500);
      b.deposit(500);
      b.withdraw(300);
      b.displayDetails();
      
	}

}
