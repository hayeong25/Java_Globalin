package Day0916;

import java.io.*;

public class Test003 {

	public static void main(String[] args) throws IOException {

	System.out.println("문자 입력 : ");
		
	int i = System.in.read();
	char ch = (char)System.in.read(); // 문자 하나 입력 시
		
	System.out.println("ASCII Value : " + i);
	System.out.println("ASCII Value : " + ch);
	
	}
}
