package mylearningprojects;
import java.util.LinkedList;
import java.util.Scanner;


class User
{
	private String username;
	private String password;
	
	
	public User(String username,String password) {
	this.username=username;
	this.password=password;
	
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
}

public class User_Authentication {
      private LinkedList<User>userList;
      public User_Authentication() {
    	  userList= new LinkedList<>();
      }
       public void register(String username, String password) {
    	   User newUser=new User(username,password);
    	   userList.add(newUser);
    	   System.out.println("User Regestered Sucessfully.......2");
       }
       public boolean login(String username,String password) {
    	   for(User user:userList) {
    		   if(user.getUsername().equals(username) && user.getPassword().equals(password)) {
    			   return true;
    		   }
    	   }
    	   return false;
       }
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 User_Authentication system=new  User_Authentication();
		 Scanner sc=new Scanner(System.in);
		 boolean logedIn=false;
		 while(!logedIn) {
			 System.out.println("Choose an Option");
			 System.out.println("1. Register");
			 System.out.println("2. Login");
			 System.out.println("3. Exit");
			 
			 int choice=sc.nextInt();
			 sc.nextLine();
			 
			switch(choice) {
			case 1:
				System.out.println("Enter a username: ");
				String regUsername=sc.nextLine();
				System.out.println("Enter a Password: 1");
				String regPassword=sc.nextLine();
				system.register(regUsername, regPassword);
				break;
				
				
				
			case 2:
				System.out.println("Enter Your Username: ");
				String logUsername=sc.nextLine();
				System.out.println("Enter a Login Password: ");
				String logPassword=sc.nextLine();
				if(system.login(logUsername, logPassword)) {
					System.out.println("Login Successful.......");
					logedIn=true;
				}
				else {
					System.out.println("Login Failed!!!!");
				}
				break;
				
				
			case 3:
				System.out.println("Exiting.......");
				logedIn=true;
				break;
				default:
					System.out.println("Invalid choice try again....");
				
			}
			 
		 }
		 sc.close();

	}

}
