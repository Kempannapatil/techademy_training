package day5;

interface Language
{
	static void kannada(String  a) {
		System.out.println("Kannada is "+a);
	}
}

interface Place {
	static void bangalore(String b) {
		System.out.println("Bangalore is "+b);
	}
}

class LocalLanguage implements Language{
	
}
public class Staticmethodsinterface {
public static void main(String[] args) {
	LocalLanguage l=new LocalLanguage();
	Language.kannada("Local Language");
	Place.bangalore("IT HUB");
}
}
