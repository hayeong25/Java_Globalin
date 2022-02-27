package Day1007;

public class Study002 {

	// 임의의 숫자가 들어있는 배열의 숫자 데이터들 중 배열의 전체 요소 출력. 짝수인 요소만 골라서 출력하고 3의 배수인 요소만 골라서 출력하는 프로그램 작성
	// 임의의 숫자 = 4 7 9 1 3 2 5 6 8
	public static void main(String[] args) {
		int i;
		int a[] = {4, 7, 9, 1, 3, 2, 5, 6, 8};
		// System.out.println(a); 일반적인 변수에 저장된 내용을 출력하는 방법이므로 배열에 저장된 데이터는 출력할 수 없다.
		System.out.println(a.length); // 배열 길이 출력
		for(i = 0; i < a.length; i++) {
			System.out.printf("%2d", a[i]);
		}
		System.out.println();
		System.out.println();
		System.out.println("짝수 요소");
		for(i = 0; i < a.length; i++) {
			if(a[i] % 2 == 0) {
				System.out.println(a[i]);
			}
		}
		System.out.println();
		System.out.println("3의 배수");
		for(i = 0; i < a.length; i++) {
			if(a[i] % 3 == 0) {
				System.out.println(a[i]);
			}
		}
	}
}