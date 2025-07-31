package day10practice;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class P3linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Integer> list=new LinkedList();
     list.add(23);
     list.add(33);
     list.add(27);
     list.add(24);
     list.add(20);
     list.add(29);
     System.out.println("list in original order: "+list);
     //System.out.println(list);
     list.removeFirst();
     list.removeLast();
     System.out.println("before reversing: "+list);
     /// to reverse there is a reverse method
     Collections.reverse(list);
     System.out.println("after Reversing: "+list);
	}

}
