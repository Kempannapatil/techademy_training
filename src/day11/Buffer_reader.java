package day11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Buffer_reader {

	public static void main(String[] args) throws IOException {
	
		
		 
        BufferedWriter br=new BufferedWriter(new FileWriter("C:\\Users\\darsh\\eclipse-workspace\\kempa\\techademypractice\\Myfile.txt"));
        		br.write("hi good morning welcome to java programming  this widely used ");
        		br.close();
        		System.out.println("Entered Successfully");
	}

}
