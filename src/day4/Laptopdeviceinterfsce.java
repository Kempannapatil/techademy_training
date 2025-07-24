package day4;

interface WiproDevices
{
	void deviceType();
	void compileSpeed();
}

class Desktop implements WiproDevices
{
	public void deviceType() {
		System.out.println("wipro provides Desktop");
	}
	
	public void compileSpeed() {
		System.out.println("compilation sppeed of desktop is fast");
	}
}

class  Laptop implements WiproDevices
{
	@Override
	public void deviceType() {
		System.out.println("wipro provides laptops");
		
	}
	
	@Override
	public void compileSpeed() {
		// TODO Auto-generated method stub
		System.out.println("compilation speed of laptop is slow");
	}
}



public class Laptopdeviceinterfsce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WiproDevices d= new Desktop();
		d.deviceType();
		d.compileSpeed();
		System.out.println();
		WiproDevices l=new Laptop();
		l.deviceType();
		l.compileSpeed();

	}

}
