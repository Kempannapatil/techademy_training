package day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student 
{
	public int age;
	 public String name;
	
	 
	 public Student(int age, String name) {
		this.age=age;
		this.name=name;
	}
	public String toString() {
		return age+"-"+name;
	}
	
	
}
public class Comparator_String {

	public static void main(String[] args) {
	
         List<Student> stud= new ArrayList<>();
         stud.add(new Student(22,"karthik"));
         stud.add(new Student(24,"Sanjeev"));
         stud.add(new Student(23,"Sunil"));
         
         Collections.sort(stud, new Comparator<Student>() {
        	 public int compare(Student s1,Student s2) {
        		 return s1.name.compareToIgnoreCase(s2.name);
        	 }
		});
        		 
         System.out.println("Sorting by names:");
        
     for(Student s:stud) {
    	 System.out.println(s);
     }
     
     Collections.sort(stud, new Comparator<Student>() {
    	 public int compare(Student s1,Student s2) {
    		 return Integer.compare(s1.age, s2.age);
    	 }
	});
     		 System.out.println();
     System.out.println("Sorting by Ages:");
     
    
      for(Student s:stud) {
	 System.out.println(s);
 }
         
	}

}
