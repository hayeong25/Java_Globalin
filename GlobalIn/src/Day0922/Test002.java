package Day0922;

public class Test002 {

	// 1/2 + 2/3 + 3/4 + ... + 9/10까지의 결과를 출력하시오
	public static void main(String[] args) {

		double i = 1;
		double sum = 0;
		while(i <=9) {
			sum += (i / (i+1));
			i++;
		}
		System.out.println("1/2 + 2/3 + 3/4 + ... + 9/10 = " + sum);
	}
}