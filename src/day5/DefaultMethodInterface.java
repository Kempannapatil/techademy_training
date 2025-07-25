package day5;

interface Group1
{
	default void display() {
		System.out.println("welcome to java");
	}
	default void read() {
		System.out.println("hii ");
		
	}
}

interface Group2
{
	default void display() {
		System.out.println("welcome to java");
	}
	default void write() {
		System.out.println("Start programming ");
}

}
class AllGroups implements  Group1,Group2{
	@Override
	public void display() {
   System.out.println("Practices daily improves ur coding");
   Group1.super.display();
   Group2.super.
    
 }



}
public class DefaultMethodInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      AllGroups g=new AllGroups();
     
      g.display();
      g.read();
      g.write();
      
	}
}

