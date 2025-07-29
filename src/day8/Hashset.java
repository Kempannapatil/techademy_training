package day8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> setData=new HashSet<Integer>();
		setData.add(10);
		setData.add(98);
		setData.add(16);
		System.out.println(setData);
		Iterator<Integer> iterator=setData.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
				

	}

}
