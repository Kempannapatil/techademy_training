package day9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CompareTwofiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String f1 = "d3.txt";
	        String f2 = "d2.txt";

	        boolean b = compareFiles(f1, f2);
	        if (b) {
	            System.out.println("Files are same.");
	        } else {
	            System.out.println("Files are different.");
	        }
	    }
	
	
	 public static boolean compareFiles(String p1, String p2) {
	        try (
	            BufferedReader reader1 = new BufferedReader(new FileReader("C:\\Users\\darsh\\OneDrive\\Desktop\\d3.txt"));
	            BufferedReader reader2 = new BufferedReader(new FileReader("C:\\Users\\darsh\\OneDrive\\Desktop\\d1.txt"));
	        ) {
	            String l1, l2;
	            int numline = 1;

	            while ((l1 = reader1.readLine())!= null && (l2 = reader2.readLine())!= null) {
	                if (!l1.equals(l2)) {
	                    return false;
	                }
	                numline++;
	            }

	            if (reader1.readLine() != null || reader2.readLine() != null) {
	                return false;
	            }

	            return true;

	        } catch (IOException e) {
	            System.out.println("An error occurred while comparing files: " + e.getMessage());
	            return false;
	        }
	    }
	}


