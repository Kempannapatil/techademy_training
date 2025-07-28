package day7;

class Mul3 implements Runnable{
	public void  run() {

		for(int i=0;i<20;i++) {
			System.out.println("hii");
//			try {
//				Thread.sleep(10);
//			} 
//			catch(Exception e){
//				e.printStackTrace();
//				
			}
		}
	}

class Mul4 implements Runnable
{
	public void  run() {

		for(int i=0;i<25;i++) {
			System.out.println("welcome");
//			try {
//				Thread.sleep(10);
//			} 
//			catch(Exception e){
//				e.printStackTrace();
//				
//			}
		}
	}
}

public class Moltithred {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Runnable m1=new Mul3();
         Runnable m2=new Mul4();
         
         Thread t=new Thread(m1);
         Thread t1=new Thread(m2);
         t.start();
         t1.start();
         try {
				Thread.sleep(1000);
			} 
			catch(Exception e){
				e.printStackTrace();
    
	}

}
}
