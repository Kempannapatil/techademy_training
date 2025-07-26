package day6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class ReadTextFileBuffered {
    public static void main(String[] args) {
    	File f1=new File("C:\\Users\\darsh\\OneDrive\\Desktop\\hii.txt");
        try {
        	
            BufferedReader reader = new BufferedReader(new FileReader(f1));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

