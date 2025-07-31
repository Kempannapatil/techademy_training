package day10practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Javacollection {

	public static void main(String[] args) {
		// adding courses
      ArrayList<String> courses=new ArrayList();
      courses.add("Java");
      courses.add("Pyathon");
      courses.add("AIML");
      courses.add("Java");
      courses.add("Sap");
      
      
      for(String c:courses) {
    	  System.out.println(c);
      }
      
      System.out.println();
      
      Set<Integer> course=new HashSet();
      course.add(101);
      course.add(202);
      course.add(101);
      course.add(201);
      course.add(405);
      
      for(Integer i:course) {
    	  System.out.println(i);
      }
      System.out.println();
      
      Map<String,Integer> map=new HashMap();
      map.put("Java", 101);
      map.put("Python", 101);
      map.put("AIML", 103);
      map.put("Java", 201);
      map.put("Sap", 405);
      
       for(String c:map.keySet()) {
    	   System.out.println(c+"="+map.get(c));
       }
      
	}

}
