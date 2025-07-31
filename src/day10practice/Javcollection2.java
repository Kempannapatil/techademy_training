package day10practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Javcollection2 {

	public static void main(String[] args) {
		// adding items to the list uding Array.asList
        ArrayList<Integer> a=new ArrayList<>(Arrays.asList(3000,2000,5000,1000,6000));
        a.add(5500);
        System.out.println(a);
        Collections.sort(a);;
        System.out.println("Sorted: "+a);
        
        ///  this for find specific index of the given item
        int b=Collections.binarySearch(a, 5000);
         System.out.println("index of 5000 in the sorted list: "+b);
//        for(Integer i:a) {
//        	System.out.println(i);
//        }
	}

}
