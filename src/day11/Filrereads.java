package day11;

import java.io.FileReader;
import java.io.IOException;

public class Filrereads {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader reader=new FileReader("C:\\Users\\darsh\\OneDrive\\Desktop\\txt.txt");
		int ch;
		while((ch=reader.read())!=-1)
		{
			System.out.print((char) ch);
		}

	}

}
