package day10practice;

import java.util.HashMap;
import java.util.Map;

public class P4HashMapstudentmark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Map<String,Integer> m=new HashMap();
     m.put("Karthk", 67);
     m.put("Snehith", 77);
     m.put("Rahul", 80);
     m.put("Rohith", 50);
     m.put("Suresh", 76);
    
     for(Map.Entry<String , Integer>  entry : m.entrySet()) {
    	 if(entry.getValue()>75) {
    		 System.out.println(entry.getKey() +"-"+entry.getValue());
    	
    		 
    	 }
     }
     
     String topStudent="";
 	int highestMarks=-1;
 	
 	for(Map.Entry<String, Integer> entry: m.entrySet()) {
 		if(entry.getValue()> highestMarks) {
 			highestMarks=entry.getValue();
 			topStudent=entry.getKey();
 		}
 	}
 	System.out.println("\nTop Student:");
 	System.out.println(topStudent +"-"+highestMarks);
	}

}
