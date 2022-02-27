package Day1021;

public class Account {

	private String name;
	private long balance; // 계좌 잔액
	public Account() {
	}
	public Account(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public long getBalance() {
		return balance;
	}
	public void deposit(long amount) { // 입금 기능
		balance += amount;
	}
	public void withdraw(long amount) { // 출금 기능
		if(balance < amount) {
			System.out.println("잔고가 부족합니다. 다시 한 번 확인하세요.");
		}
		else {
			balance -= amount;
		}
	}
}