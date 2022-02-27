package Day1012;

public class Salary {

	private int pay;

	public int getPay() {
		return pay;
	}
	public void setPay(int pay, String pass) {
		if(pass.equals("1234")) {
			this.pay = pay; // this는 지금 이 클래스를 뜻함
		}
	}
	public int add(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}
}