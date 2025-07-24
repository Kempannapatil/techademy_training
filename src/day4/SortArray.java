package day4;

abstract class ArraySorting
{
	protected int[] arr;
	public ArraySorting(int[] arr) {
		this.arr=arr;
	}
	
	public abstract void Sort();
	
	public void displayArray() {
		System.out.println("Sorted array: ");
		for(int num:arr) {
			System.out.print(num+" ");
		}
	}
	
	
}

class BubbleSort extends ArraySorting
{
	public BubbleSort(int[]arr) {
		super(arr);
	}
	
	@Override
	public void Sort() {
		
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
	}
}

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,5,6,9,2};
      BubbleSort b=new BubbleSort(arr);
      b.Sort();
      b.displayArray();
    
	}

}
