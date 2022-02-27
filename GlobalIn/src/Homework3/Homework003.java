package Homework3;

// 교재 126p 5번 문제

import java.util.*;

public class Homework003 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		int temp = 0;
		System.out.println("정수 10개 입력 >> ");
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length-1; j++) {
			if(a[j] > a[j+1]) {
				temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
				}
			}
		}
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		sc.close();
	}
}