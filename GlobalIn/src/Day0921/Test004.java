package Day0921;

public class Test004 {

	// 1부터 100까지의 정수의 합, 짝수의 합, 홀수의 합을 구하시오. 단, while 반복문 사용
	public static void main(String[] args) {

		int n = 0;
		int sum = 0, odd = 0, even = 0;
		while(n <= 100) {
			sum += n;
			if(n % 2 == 0) {
				even += n;
			}
			else {
				odd += n;
			}
			n++;
		}
		/* do while문으로 바꾸면
		   do {
			sum += n;
			if(n % 2 == 0) {
				even += n;
			}
			else {
				odd += n;
			}
			n++;
		  } 
	    	while(n <= 100)
		 */
		/* for문으로 바꾸면
		 for(n = 0; n <= 100; n++) {
		 sum += n;
		 if(n % 2 == 0) {
				even += n;
			}
			else {
				odd += n;
			}
		 }
		*/
		System.out.println("1부터 100까지의 정수의 합은 " + sum + "입니다.");
		System.out.println("1부터 100까지의 홀수의 합은 " + odd + "입니다.");
		System.out.println("1부터 100까지의 짝수의 합은 " + even + "입니다.");
	}
}