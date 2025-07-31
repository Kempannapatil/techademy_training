package day10practice;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreesetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Set<String> t=new TreeSet();
    t.add("India");
    t.add("Srilanka");
    t.add("Bangladesh");
    t.add("America");
    t.add("Japan");
    t.add("Russia");
    System.out.println(t);
    t.remove("Russia");
    System.out.println(t);
    
    
	}

}