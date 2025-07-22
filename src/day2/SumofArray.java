package day2;

public class SumofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sum=0;
        int a[]= {5,10,15,20};
        for(int i=0;i<a.length;i++) { //for(int val:a)
        	sum=a[i]+sum;
        	
        }
        System.out.println(sum);
	}

}
