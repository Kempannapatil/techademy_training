package day4;

public class AlaramTimer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] tasks= {"Drink tea","Do Java Programs","Complete your Lunch","Watch Movie","Practice Codes"};
		double[] times= {11.00,12.00,01.00,02.00,03.00};
		String a="";
		
		for(int i=0;i<times.length;i++) {
			if(times[i]<10) {
				a="pm";
			}else {
				a="am";
			}
			System.out.println("Now the time is : "+times[i]+""+a);
			System.out.println("So your task is :"+tasks[i]);
			System.out.println("---------------------------");
		}
		

	}

}
