package day5;
interface A1 {
    default void greet() {
        System.out.println("Hello from A");
    }

    default void hello() {
        System.out.println("Hello method from A");
    }
}

interface B1 {
    default void greet() {
        System.out.println("Hello from B");
    }

    default void bye() {
        System.out.println("Bye from B");
    }
}

class MyClass implements A1, B1 {

   
    @Override
    public void greet() {
        System.out.println("Resolved greet() in MyClass");
        A1.super.greet(); 
        B1.super.greet();  
    }

}
    
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  MyClass obj = new MyClass();
	        obj.greet();   
	        obj.hello();  
	        obj.bye();  
	}

}
