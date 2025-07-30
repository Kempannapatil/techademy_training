package mylearningprojects;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AssessmentHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <String,Integer>studentScore= new HashMap<String,Integer>();
		  Scanner sc=new Scanner(System.in);
		  while(true) {
			  System.out.println("Choose an Option: ");
			  System.out.println("1. Add Student");
			  System.out.println("2. Get Student Score");
			  System.out.println("3. Exit");
			  
			  int choice =sc.nextInt();
			  sc.nextLine();
			  
			  
			  switch(choice) {
			  case 1 :
				  System.out.println("Enter the Student Name: ");
				  String name=sc.nextLine();
				  System.out.println("Enter the student score");
				  int score=sc.nextInt();
				  studentScore.put(name, score);
				  break;
				  
				  
			  case 2:
				  System.out.println("Enter the Student name to get the score:");
				  String studentName=sc.nextLine();
				  Integer StudentScore=studentScore.get(studentName);
				  if(StudentScore != null) {
					  System.out.println("Score for "+studentName+" is:" + studentScore);
				  }else {
					  System.out.println("Student not found");
			 }	
				  break;
				  
			  case 3:
				  System.out.println("Exiting...");
				  sc.close();
				  System.exit(0);
				  
				  default:
					  System.out.println("Invalid choice.please try again ");
				  
			  }
		  }
       
	}

}
