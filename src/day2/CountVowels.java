package day2;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "Java Programming";
	        int count = 0;

	        str = str.toLowerCase();
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                count++;
	            }
	        }

	     System.out.println("Number of vowels: " + count);
	       }

}
