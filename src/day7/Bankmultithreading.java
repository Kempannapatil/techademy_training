package day7;
class Bank_Mul
{
	private double balance;
	public Bank_Mul(double intialbalance) {
		this.balance=intialbalance;
		}
	
	public synchronized void deposit(double amount) {
		balance=balance+amount;
		System.out.printf("%s deposite : %.2f ,Balance: %.2f%n",Thread.currentThread().getName(),amount,balance);
	}
	public synchronized void withdraw(double amount) {
		if(balance>=amount) {
			balance=balance-amount;
			System.out.printf("%s withdraw: %.2f,Balance:%.2f%n",Thread.currentThread().getName(),amount,balance);
		}
		else {
			System.out.printf("%s: Insufficient funds for withdrawing %.2f,balance: %.2f%n" ,Thread.currentThread().getName(),amount ,balance);
			
		}
	}
	public double getBalance() {
		return balance;
	}
}

public class Bankmultithreading {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Bank_Mul account=new Bank_Mul(5000.0);
		Thread t1=new Thread(() ->{
			for(int i=0;i<3;i++) {
				account.deposit(200.0);
				sleep(100);
			}
		},"Dposit-Thread");
		
		Thread t2=new Thread(()->{
			for(int i=0;i<3;i++) {
				account.withdraw(1000.0);
				sleep(120);
			}
		},"Withdraw-Thread");
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.printf("Final Balance = %.2f%n",account.getBalance());
	}	
 public static void sleep(int millis) {
	 try {
		 Thread.sleep(millis);
	 }
	 catch(InterruptedException e) {
		 
	 }
   }
}


