package day8;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashMap<String, String> capital=new HashMap<String,String>();
       capital.put("India","Delhi");
       capital.put("Srilanka", "colombo");
       capital.put("Bagladesh", "Daka");
       capital.put("Bagladesh", "Daka");
       capital.put("Germany", "Berlin") ;
      // System.out.println(capital);
       // we can get particular item by key value
      // System.out.println( capital.get("India"));
      // capital.remove("India");
       // to clear used clear() method used
       
    //   capital.clear();
       System.out.println(capital);
       System.out.println( capital.size());
       for(String i:capital.keySet()) {
    	   System.out.println(i);
       }
       for(String i:capital.values()) {
    	   System.out.println(i);
       }
       for(String i:capital.keySet()) {
    	   System.out.println("Key: "+ i + ", value: " + capital.get(i));
       }
	}

}
