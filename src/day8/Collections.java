package day8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  List<Integer> data=new ArrayList<Integer>();
		     data.add(10);
		     data.add(11);
		     data.add(23);
		     data.add(43);
     for(int i=0;i<data.size();i++) {
   		    	 System.out.println(data.get(i));   
   		    	 }
		   //  for(Object i:data) {  /// auto boxing
		    	 
		    //	int data1=(Integer) i;// its the
		    	// System.out.println(i);
		     }
 
	}


