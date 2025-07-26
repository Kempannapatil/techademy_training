package day6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.imageio.IIOException;

public class ReadCsvexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     File f1=new File("C:\\Users\\darsh\\Downloads\\Book1.csv");
     try {
    	 BufferedReader reader=new BufferedReader(new FileReader(f1));
    	 String line;
    	 
    	 while((line = reader.readLine()) != null) {
    		 System.out.println(line);
    	 }
     }
     catch(IOException e) {
    	 System.out.println("Error reading file: " + e.getMessage());
     }
	} 

}
