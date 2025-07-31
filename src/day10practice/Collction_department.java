package day10practice;

import java.util.ArrayList;
import java.util.Collections;

public class Collction_department {
	class department
	{
		private String name;
		private double sales;
		private double expenses;
	  
		public department(String name, double sales,double expenses) {
		this.name=name;
		this.sales=sales;
		this.expenses=expenses;
		}
		public double getProfit() {
			return sales-expenses;
		}
		public String getName() {
			return name;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<department> dept=new ArrayList();
      dept.add(new  Collction_department() . new department ("sales",200000,15000.0));
      dept.add(new  Collction_department().new department("Marketting",30000,20000));
      dept.add(new  Collction_department().new department("Research",400000,25000));
      
      
      for(department d:dept) {
    	  System.out.println(d.getName()+"Profit: "+d.getProfit());
      }
      
      dept.sort((d1,d2)-> Double.compare(d1.getProfit(),d2.getProfit()));
     System.out.println("sorting done");
      
      for(department d : dept) {
    	  System.out.println(d.getName()+"Profit: "+d.getProfit());
      }
	}

}
