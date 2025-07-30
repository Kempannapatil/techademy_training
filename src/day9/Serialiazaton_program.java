package day9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Book implements Serializable
{
	private String name;
	private int publishyear;
	
	  public Book(String name,int publishyear) {
		  
		this.name=name;
		this.publishyear=publishyear;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPublishyear() {
		return publishyear;
	}
	public void setPublishyear(int publishyear) {
		this.publishyear = publishyear;
	}
	 public Book() {
		super();
	}
	
}
public class Serialiazaton_program {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Book b=new Book();
		b.setName("kempanna");
		b.setPublishyear(2003);
		try {
			FileOutputStream out=new FileOutputStream("C:\\Users\\darsh\\OneDrive\\Desktop\\hii.txt");
			ObjectOutputStream output= new ObjectOutputStream(out);
			output.writeObject(b);
			
			System.out.println("Serializaed data saved in file");
		   }catch(IOException e) {
			e.printStackTrace();
		}
       
	}

	
	}


