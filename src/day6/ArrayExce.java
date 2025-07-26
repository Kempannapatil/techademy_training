package day6;

public class ArrayExce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {10,20,40,50,80};
    	
    	try {
    		a[5]=100;
    		System.out.println("100 is the value of index" +a);
    	}
    	catch(Exception e){
    		System.out.println(e.getMessage());
    	}
	}

}
