package day5;

public class Except {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] a= {10,20,40,50,80};
    
    try {
    	a[5]=100;
    	System.out.println("Error:Invalid index");
    }
    catch(Exception e) {
    	System.out.println(e.getMessage());
    }
    
	}

}
