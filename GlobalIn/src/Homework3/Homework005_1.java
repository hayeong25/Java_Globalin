package Homework3;

public class Homework005_1 {
	static String clap(int i, int j) { // i 십의 자리 j 일의 자리
		int count = 0; // 박수 치는 횟수
		if((i % 3 == 0) && (i != 0))
			count++;
		if((j % 3 == 0) && (j != 0))
			count++;
		switch(count) {
		case 1:
			return "박수 한 번";
		case 2:
			return "박수 두 번";
		}
		return "";
	}
	public static void main(String[] args) {

		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if(clap(i, j).equals(""))
				System.out.println(i + "" + j + clap(i, j));
			}
		}

	}
}