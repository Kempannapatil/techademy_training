package day2;

public class StringbuilderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 5; i++) {
            sb.append("Line ").append(i).append("\n");
        }
         System.out.println("Result:\n" + sb);


	}

}
