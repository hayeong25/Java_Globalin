package Day1105;

// parseInt(), valueOf()

public class StringEx6 {

	public static void main(String[] args) {
		int iVal = 100;
		// String 기본 자료형
		String strVal = String.valueOf(iVal); // int를 String으로 변환
		double dVal = 200.0;
		String strVal2 = dVal + ""; // int를 String으로 변환하는 또 다른 방법
		double sum = Integer.parseInt("+" + strVal) + Double.parseDouble(strVal2);
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		// parseInt()나 parseFloat()과 같은 메소드는 문자열에 공백 또는 문자가 포함되어 있는 경우, 변환 시 예외(NumberFormatException) 발생 가능 		
		System.out.println(String.join("", strVal, "+", strVal2, "=") + sum);
		System.out.println(strVal + "+" + strVal2 + "=" + sum2);
	}
}