package day5;
interface A
{
	void show();
	
}
interface B{
	 void show();
}

interface C{
	void show();
}

class  Group implements A,B{
	@Override
	public void show() {
		
		System.out.println("Welcome to multiple interface");
	}
}
public class MultipleInteface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      A g=new Group();
      g.show();
	}

}
