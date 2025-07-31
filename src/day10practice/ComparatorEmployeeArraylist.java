package day10practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employeee
{
	private int id;
	private String name;
	private double  salary;
	public Employeee(int id,  String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return id +"-"+name+"- ₹"+salary;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
public class ComparatorEmployeeArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Employeee> emp=new ArrayList();
       emp.add(new Employeee(101,"Anita",34000));
       emp.add(new Employeee(103,"Preeti",44000));
       emp.add(new Employeee(105,"Roopa",50000));
       emp.add(new Employeee(108,"Kavita",30000));
       
       
       Collections.sort(emp, new Comparator<Employeee>() {
           public int compare(Employeee e1, Employeee e2) {
               return e1.getName().compareTo(e2.getName());
           }
       });
       System.out.println("Employee sorted by name:");
       System.out.println();
       for(Employeee e: emp) {
    	   System.out.println(e);
    	   
       }
       System.out.println();
       System.out.println();
       Collections.sort(emp, new Comparator<Employeee>() {
           public int compare(Employeee e1, Employeee e2) {
               return Double.compare(e2.getSalary(), e1.getSalary());
           }
       });
    		 System.out.println("Employee sorted by salary:");
    		 System.out.println();
    		 for(Employeee e:emp) {
    			 System.out.println(e);
    		 }
      
       
       
	}

}
