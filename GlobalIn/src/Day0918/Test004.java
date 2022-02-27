package Day0918;

import java.io.*;

public class Test004 {

	public static void main(String[] args) throws IOException {

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String grade;
		System.out.println("학점을 입력하세요 : ");
		grade = br.readLine();
		switch(grade) {
		case "A": case "B":
			System.out.println("Excellent");
		break;
		case "C": case "D":
			System.out.println("Good");
		break;
		case "F":
			System.out.println("Bye");
		break;
		default:
			System.out.println("오류");
		}
	}
}