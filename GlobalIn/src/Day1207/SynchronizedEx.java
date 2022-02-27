package Day1207;

class ATM implements Runnable {

	// ATM기의 잔고 설정
	private long depositeMoney = 10000;
	
	@Override
	public void run() {
		// 동기화 블럭
		synchronized (this) {
			// 동기화 조건을 갖춘 스레드가 동시에 수행되면 다른 스레드는 첫 번째 스레드가 끝나기 전까지 수행 할 수 없음
			for (int i = 0; i < 10; i++) {
				notify();
				// notify() : 대기하는 스레드 깨움. 대기하는 스레드가 여럿인 경우, 랜덤으로 깨운다.
				// nothfyAll() : 대기하는 모든 스레드를 깨움
				
				try {
					wait();
					// wait() : synchronized 구문에 있는 스레드만 실행 멈춤
					
					Thread.sleep(1000); // 시간 간격은 밀리초로 1초에 한 번씩
				} catch (InterruptedException ie) {
					ie.printStackTrace();
				}
				if(getDepositeMoney() <= 0) {
					break;
				}
				
				// 출금 메소드 호출
				withDraw(1000);
			}
		}
	}

	public long getDepositeMoney() {
		return depositeMoney;
	}
	
	// 출금 메소드
	public void withDraw(long howMuch) {
		if(getDepositeMoney() > 0) { // 잔고가 0보다 크면 출금
			// 잔액에서 howMuch를 뺀 나머지 금액을 현재 잔액으로 설정
			depositeMoney -= howMuch;
						
			// 현재 작업자(스레드)의 이름과 잔액 출력
			System.out.print(Thread.currentThread().getName() + ", ");
			System.out.printf("잔액 : %d원 \n", getDepositeMoney());
		}
		else { // 현재 잔액이 0보다 작을 경우
			System.out.print(Thread.currentThread().getName() + ", ");
			System.out.printf("잔액이 부족합니다.");	
		}
	}
}

public class SynchronizedEx {
	public static void main(String[] args) {
		// atm 객체 생성
		ATM atm = new ATM();
		
		// mother 스레드와 son 스레드가 같이 atm을 공유하므로 동기화를 위한 조건을 갖추고 있다.
		// 한 스레드가 synchronized 블럭 시작하면 다른 스레드는 실행 중인 스레드가 끝날 때까지 대기
		Thread mother = new Thread(atm, "mother");
		Thread son = new Thread(atm, "son");
		
		mother.start();
		son.start();
	}
}