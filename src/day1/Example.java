package day1;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;



public class Example {
public static void main(String[] args) {
	
	LocalTime lt=LocalTime.now();
	System.out.println(lt);
	
	LocalDate ld=LocalDate.now();
	System.out.println(ld);
	
	
	LocalDateTime r= LocalDateTime.now();
	System.out.println(r);
}
}
