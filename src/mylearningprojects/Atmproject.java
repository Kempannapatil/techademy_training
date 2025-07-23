package mylearningprojects;

import java.util.Scanner;

public class Atmproject {
	
	private double balance;
	private  Scanner scanner;
	
	public Atmproject() {
		balance = 1000;
		scanner =new Scanner(System.in);
		
	}
     public void displayMainu() {
    	 // to show the entry options
    	 System.out.println("ATM Menu");
    	 System.out.println("1. Check Balance");
    	 System.out.println("2. Deposit Money");
    	 System.out.println("3. Withdraw Money");
    	 System.out.println("4. Exit");
    	 
    	 
     }
     
     public void checkBalance() {
    	 System.out.println("Your Balance is $ "+ balance);
    	 
    	 
     }
    public void withdraw() {
    	System.out.println("Enter the amount to withdraw : $ ");
    	double amount=scanner.nextDouble();
    	if(amount>0 && amount<=balance) {
    		balance-=amount;
    		System.out.println("$" + amount + "has been withdrawn");
    	}
    	else if(amount>balance) {
    		System.out.println("insufficient funds. your balance  is $: "+ balance);
    	}
    	else {
    		System.out.println("Invalid amount, please enter positive value");
    	}
    	
     }
   public void deposit() {
	   System.out.println("Enter The amount deposit: $");
   	double amount=scanner.nextDouble();
   	if(amount>0) {
   		balance+=amount;
   		System.out.println("$" + amount +"has been deposited");
   	}
   	else {
   		System.out.println("Invalid  amount please add positive value");
   	}
 }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Atmproject atm=new Atmproject();
     
     while (true) {
    	 atm.displayMainu();
    	 System.out.println("Enter Your Choice: ");
    	 int choice=atm.scanner.nextInt();
    	 
    	 switch(choice) {
    	 case 1:
    		 atm.checkBalance();
    		 break;
    	 case 2:
    		 atm.deposit();
    		 break;
    	 case 3:
    		 atm.withdraw();
    		 break;
    	 case 4:
    		 System.out.println("thank you for choosing ATM, good bye");
    		 break;
    		 default:
    			 System.out.println("invalid choice, please select valid option");
    	 }
     }
     
     
	}

}
