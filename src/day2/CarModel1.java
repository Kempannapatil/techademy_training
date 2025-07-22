package day2;

class CarModel {
  private String model;
  private int year;
  
  public void setModal(String model, int year) {
	  this.model=model;
	  this.year=year;
	  
  }
  public String getModel() {
	  return model;
	  
  }
  public int getYear() {
	  return year;
  }

}
public class CarModel1{
	public static void main(String[] args) {
		CarModel c=new CarModel();
		c.setModal("audi", 2002);
		System.out.println("modal name :" +c.getModel());
		System.out.println("modal year :" + c.getYear());
	}
}
