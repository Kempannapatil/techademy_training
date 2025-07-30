package day9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Library implements Serializable
{
	private String bookname;
	private String author;
	public Library(String name,String Author) {
		super();
		this.bookname=bookname;
		this.author=author;
		
		
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Library() {
		// TODO Auto-generated constructor stub
	}
}

public class Serialization_Demo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
       Library l1=new Library();
      try {
    	  l1.setBookname("indepedent");
          l1.setAuthor("Sam");
          FileOutputStream out=new FileOutputStream("C:\\Users\\darsh\\Downloads\\download.txt");
          ObjectOutputStream obj=new ObjectOutputStream(out);
          obj.writeObject(l1);
          out.close();
          obj.close();
      	FileInputStream in=new FileInputStream("C:\\Users\\\\darsh\\\\Downloads\\\\download.txt");
   	ObjectInputStream input=new ObjectInputStream(in);
   	Library  l2=(Library)input.readObject();
   	in.close();
   	input.close();
   	
       System.out.println("Deserialized library:");
       System.out.println("Book name: " +l2.getBookname());
       System.out.println("Author: " + l2.getAuthor());

          
      }
      catch(IOException | ClassNotFoundException e) {
    	  System.out.println("file not found");
      }
	}

}
