package day10practice;

import java.util.ArrayList;
import java.util.Collections;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ArrayList<String> a=new ArrayList();
  a.add("Kanaka");
  a.add("Kiran");
  a.add("Santosh");
  a.add("Sanketh");
  System.out.println("before Sorting: ");
  System.out.println(a);
 // a.remove(2);
  System.out.println();
  Collections.sort(a);
  System.out.println("After sorting:");
  System.out.println(a);
 
	}

}
