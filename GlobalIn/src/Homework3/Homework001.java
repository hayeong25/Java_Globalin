package Homework3;

// 교재 126p 2번 문제

import java.util.*;

public class Homework001 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 10개 입력 >> ");
		int[] a = new int[10];
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < a.length; i++) {
			if(a[i] % 3 == 0 ) {
				System.out.printf("%d\t", a[i]);
			}
		}
		sc.close();
	}
}