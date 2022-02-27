package Day1106;

import java.util.*;

public class StringTokenizerEx1 {

	public static void main(String[] args) {
		String source = "100,200,300,400";
		String expression = "x=100*(200+300)/2";
		StringTokenizer st = new StringTokenizer(source, ",");
		StringTokenizer s = new StringTokenizer(expression, "+-*/=()", false);
		while(st.hasMoreTokens()) {
			System.out.println("=====");
			System.out.println(st.countTokens());
			System.out.println(st.nextToken());
			System.out.println(st.countTokens());
			System.out.println("---------");
		}
		while(s.hasMoreTokens()) {
			System.out.println("=====");
			System.out.println(s.countTokens());
			System.out.println(s.nextToken());
			System.out.println(s.countTokens());
			System.out.println("---------");
		}
	}	
}