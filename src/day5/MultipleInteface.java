package day5;
interface A
{
	void show();
	
}
interface B{
	 void show();
	 
	 void draw();
}

interface C{
	void show();
}

class  Group implements A,B,C{
	@Override
	public void show() {
		
		System.out.println("Welcome to multiple interface");
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing");
	}
}
public class MultipleInteface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      A g=new Group();
      g.show();
      B b=new Group();
      b.draw();
	}

}
