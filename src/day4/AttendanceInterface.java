package day4;


interface ClassAttendance {
    void studentPresent();
    void studentAbsent();
    void totalStudents();
    void printReport();
}
class ClassFirst1 implements ClassAttendance{
    private int present;
    private int absent;

    public ClassFirst1(int present, int absent) {
        this.present = present;
        this.absent = absent;
    }

    public void studentPresent() {
        System.out.println("Class First - Present: " + present);
    }

    public void studentAbsent() {
        System.out.println("Class First - Absent: " + absent);
    }

    public void totalStudents() {
        int total = present + absent;
        System.out.println("Total students in First class: " + total);
    }

    public void printReport() {
        studentPresent();
        studentAbsent();
        totalStudents();
        System.out.println("---------------------------------------------");
    }
}

class ClassSecond2 implements ClassAttendance {
    private int present;
    private int absent;

    public ClassSecond2(int present, int absent) {
        this.present = present;
        this.absent = absent;
    }

    public void studentPresent() {
        System.out.println("Class Second - Present: " + present);
    }

    public void studentAbsent() {
        System.out.println("Class Second - Absent: " + absent);
    }

    public void totalStudents() {
        int total = present + absent;
        System.out.println("Total students in Second class: " + total);
    }

    public void printReport() {
        studentPresent();
        studentAbsent();
        totalStudents();
        System.out.println("---------------------------------------------");
    }
}
public class AttendanceInterface {

	public static void main(String[] args) {
		System.out.println("--------------ATTENDANCE REPORT-------------\n");

        ClassAttendance firstClass = new ClassFirst1(75, 25);
        firstClass.printReport();

        ClassAttendance secondClass = new ClassSecond2(64, 26);
        secondClass.printReport();
    }


	}


