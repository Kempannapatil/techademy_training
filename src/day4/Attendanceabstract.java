package day4;

abstract class Attendance
{
	protected int present;
	protected int absent;
	public Attendance(int present,int absent) {
		this.present=present;
		this.absent=absent;
	}
	abstract void studentPresent();
	abstract void studentAbsent();
	
	
	void PrintReport() {
		studentPresent();
		studentAbsent();
		System.out.println("---------------------------------------------/n");
	}
	public  void totalstudents() {
		int total=present+absent;
		System.out.println("Total number of students: "+total);
		}
	
}


class First extends Attendance
{
	public First(int present,int absent) {
		super(present,absent);
	}
	
	@Override
	void studentPresent() {
		System.out.println("Class first-Present: "+ present);
		
	}
	@Override
	void studentAbsent() {
		System.out.println("Class first-Absent: "+absent);
		totalstudents();
	}
	
	
}
class Second extends Attendance
{
	public Second(int present,int absent) {
		super(present,absent);
	}
	
	@Override
	void studentPresent() {
		System.out.println("Class Second-Present: "+ present);
		
	}
	@Override
	void studentAbsent() {
		System.out.println("class Second-Absent: "+absent);
		totalstudents();
}
	
}

public class Attendanceabstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------------ATTEDANCE REPORT-------------");
		System.out.println();
       Attendance f=new First(75,25);
       f.studentPresent();
       f.studentAbsent();
      
      System.out.println();
      Attendance s=new Second(64,26);
      s.studentPresent();
      s.studentAbsent();
	}

}
