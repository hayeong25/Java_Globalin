package Day1012;

public class SalaryEx {

	public static void main(String[] args) {
		Salary sal = new Salary();
		sal.setPay(10000, "1234"); // 내 통장에 10000원을 저장하고 패스워드는 1234로 저장
		int myPay = sal.getPay();
		System.out.println("지금 나의 계좌에는 얼마? : " + myPay); // Salary 클래스의 번호와 패스워드가 일치하지 않으면 잔액 출력 안 됨
		int result = sal.add(10, 20); // 30
		System.out.println("덧셈한 결과 : " + result);
	}
}