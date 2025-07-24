package day4;
class RealEstate{
	int rent;
	int expenses;
	double electricity;
	
	public void Rent(int rent,int expenses) {
		this.rent=rent;
		this.expenses=expenses;
		System.out.println("rent is: "+rent);
		
		System.out.println("expenses are: "+expenses);
		double total=rent+expenses;
		System.out.println("total: "+total);
		
	}
	public void rent_money(double Rent,double electricity) {
		this.rent=rent;
		this.electricity=electricity;
		System.out.println("rent is: "+Rent);
		System.out.println("expenses are: "+electricity);
		double total=Rent+electricity;
		System.out.println("Total: "+total);
}
}
public class Property {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RealEstate R = new RealEstate();
		R.rent_money(1000,6900);
		R.rent_money(6000.0,12000.0);
		

	}

}
