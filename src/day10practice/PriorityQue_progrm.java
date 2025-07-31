package day10practice;

import java.util.Comparator;
import java.util.PriorityQueue;

class Patient
{
	String name;
	int priority;
	
	public Patient(String name,int priority) {
		this.name=name;
		this.priority=priority;
	}

	@Override
	public String toString() {
		return name+"(priority:"+priority+")";
	}
	
	
}
public class PriorityQue_progrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      PriorityQueue<Patient> queue=new PriorityQueue<>(new Comparator<Patient>() {
    	  public int compare(Patient p1,Patient p2) {
    		  return Integer.compare(p1.priority, p2.priority);
    	  }
      });
      queue.add(new Patient("Anita", 4));
      queue.add(new Patient("Raj", 2));
      queue.add(new Patient("Meena", 5));
      queue.add(new Patient("Zaid", 3));
      queue.add(new Patient("Kiran", 1));
      System.out.println("Treating patients in order of priority:");
      
      while (!queue.isEmpty()) {
          Patient p = queue.poll(); // removes and returns highest priority
          System.out.println("Treating: " + p);
      }
	}

}
