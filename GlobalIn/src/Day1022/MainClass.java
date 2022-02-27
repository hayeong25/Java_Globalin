package Day1022;

import java.io.*;

public class MainClass {

	public static void main(String[] args) throws IOException {
		BClass bb = new BClass();
		if(!bb.input()) {
			System.out.println("Error");
			return;
		}
		double result = bb.calc();
		bb.write(result); // write의 매개 변수는 double형
	}
}