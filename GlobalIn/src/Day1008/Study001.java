package Day1008;

/*
  다차원 배열(3차원)
  
  선언 : 자료형[][][] 배열명;
  		  자료형 배열명[][][];
  		  
  메모리 할당(배열의 크기 지정)
  		배열명 = new 자료형[면][행][열]
  		
  배열명 = {
  				{
  					{ 열, , , }, // 행
  					{ , , , },
  					{ , , , }
  				}, // 면 구분
  				{
  					{ , , , },
  					{ , , , },
  					{ , , , }
  				},
  			};
 */
public class Study001 {

	public static void main(String[] args) {

		int apt[][][]; // 배열 선언
		apt = new int[2][3][4]; // 배열 크기 지정(메모리 할당)
		// 배열 크기 : 24
		int val = 1;
		int k, i, j; // 면 행, 열
		for(k = 0; k < apt.length; k++) {
			for(i = 0; i < apt[k].length; i++) {
				for(j = 0; j < apt[k][i].length; j++) {
					apt[k][i][j] = val; // apt[0][0][0]
				}
			}
		}
		System.out.println();
		for(k = 0; k < apt.length; k++) {
			for(i = 0; i < apt[k].length; i++) {
				for(j = 0; j < apt[k][i].length; j++) {
					System.out.print("apt["+k+"]["+i+"]["+j+"] : " + apt[k][i][j] + "\t\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}