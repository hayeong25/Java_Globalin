package Day1027;

public class UseGame {

	public static void main(String[] args) {

		Unit[] ref = new Unit[3];
		ref[0] = new Marine();
		ref[1] = new SiegeTank();
		ref[2] = new Dropship();
		for(int i = 0; i < ref.length; i++) {
			System.out.println("==========");
			// 모든 유닛을 이동시킴
			ref[i].move(100, 200);
			ref[i].message();
			System.out.println("==========");
		}
	}
}