package Day1008;

/*
	가변 배열(레기드 배열)
	- 행만을 관리한다(1차원)
	- 열은 행이 바뀌면서 메모리 할당
 */

public class Study002 {

	public static void main(String[] args) {

		/*
		int arr[][] = new int[4][];
		arr[0] = new int[2];
		arr[1] = new int[2];
		arr[2] = new int[5];
		arr[3] = new int[3];
		*/
		int arr[][] = { {100, 100, 100},
								{30, 40},
								{80, 80, 70, 100},
								{90}
							};
		int sum = 0;
		float avg = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int value : arr[i]) { // 행에 해당하는 열
				System.out.print(value + " " + "\t");
				sum += value; // 한 행에 대한 총점
			}
			avg = (float)sum / arr[i].length; // 한 행에 대한 평균
			System.out.printf("총점 : %d, 평균 : %.2f\n", sum, avg);
			sum = 0; // 행이 바뀌면서 총점 초기화
		}
	}
}