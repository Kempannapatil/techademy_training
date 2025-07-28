package day7;
class Mul1 extends Thread
{  
	public void  run() {

	for(int i=0;i<200;i++) {
		System.out.println("hii");
		try {
			Thread.sleep(10);
		} 
		catch(Exception e){
			e.printStackTrace();
			
		}
	}
}
}
class Mul2 extends Thread
{
	public void  run() {

		for(int i=0;i<200;i++) {
			System.out.println("this is a new program");
			try {
				Thread.sleep(10);
			} 
			catch(Exception e){
				e.printStackTrace();
				
			}
}
	}}

public class Multithreading {
public static void main(String[] args) {
	Mul1 m1=new Mul1();
	Mul2 m2=new Mul2();
	//System.out.println(m2.getPriority());
	//m2.setPriority(Thread.MAX_PRIORITY);
	m1.start();
	try {
		Thread.sleep(10);
	} 
	catch(Exception e){
		e.printStackTrace();
		
	}
	m2.start();
}
}
