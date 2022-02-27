package Day1106;

import java.util.*; // Scanner
import java.io.*; // File

public class ScanExam1 {

	public static void main(String[] args) throws Exception{

		Scanner sc = new Scanner(new File("test.txt")); // 예외처리 필수
	
		int cnt = 0;
		int totalSum = 0;

		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			Scanner sc2 = new Scanner(line).useDelimiter(",");

			int sum = 0;

			while(sc2.hasNextInt()) {
				sum += sc2.nextInt();
			}
			System.out.println(line + ", sum = " + sum);
			totalSum += sum;
			cnt++;
		}
		System.out.println("Line : " + cnt + ", Total : " + totalSum);
	}
}