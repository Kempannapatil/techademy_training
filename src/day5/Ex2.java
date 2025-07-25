package day5;
interface Movie{
 default void watchingMovie() {
	 System.out.println("i wathed kannada movie");
 }
 
  default void reel() {
	  System.out.println("I scrolled reels in istagram");
  }
}
interface books{
	default void reading() {
		System.out.println("i like reading books");
	}
	
	
	default void writing() {
		System.out.println("i like writing");
	}
}

class Hobbies implements Movie,books{
	
}
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Hobbies h=new Hobbies();
           h.watchingMovie();
           h.reading();
           h.reel();
           
	}

}
