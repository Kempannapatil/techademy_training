package day8;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Set<Integer> setData=new TreeSet<Integer>();
      setData.add(10);
      setData.add(98);
      setData.add(16);
      Iterator<Integer> iterator=setData.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());

	}

}
}