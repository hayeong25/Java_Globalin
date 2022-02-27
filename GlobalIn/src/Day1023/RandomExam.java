package Day1023;

import java.util.Random;

public class RandomExam {

	public static void main(String[] args) {
		Random r = new Random();
		for(int i = 0; i < 6; i++) {
			System.out.printf("%4d", r.nextInt(100)); // 0~99까지의 난수
		}
	}
}