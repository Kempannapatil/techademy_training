package day10practice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<String> list=new ArrayList(List.of("A","B","C","D"));
     ListIterator<String> it=list.listIterator();
     System.out.println("Forward");
     while(it.hasNext()) {
    	 System.out.println(it.next());
     }
     
     System.out.println("Backward");
     while(it.hasPrevious()) {
    	 System.out.println(it.previous());
     }
 }

}
