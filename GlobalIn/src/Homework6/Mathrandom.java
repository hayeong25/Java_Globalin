package Homework6;

// 교재 280p 3번 문제

public class Mathrandom {
	public static void main(String[] args) {
		while(true) {
			int r[] = new int[3];
			
			for (int i = 0; i < r.length; i++) {
				r[i] = (int)(Math.random() * 3 + 1);
				System.out.print(r[i] + "\t");
			}
			System.out.println();
			
			if((r[0] == r[1]) && (r[1] == r[2])) {
				System.out.println("성공");
				System.exit(0);
			}
		}
	}
}