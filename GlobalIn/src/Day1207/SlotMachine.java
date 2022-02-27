package Day1207;

// 공유 자원 클래스(스레드 구현)
class Slot extends Thread {
	
	int m_nNumber; // 난수를 발생시켜 저장할 변수 선언
	boolean m_bFlag; // while 조건으로 활용할 변수
	
	public Slot(String strName) {
		super(strName);
		m_bFlag = true;
	}
	
	@Override
	public void run() { // 스레드가 시작되면 호출
		try {
			while(m_bFlag) {
				m_nNumber = (int)(Math.random() * 10);
				
				Thread.sleep((int)(Math.random() * 100));
			}
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}	
	}
	
	public void setFinish() {
		m_bFlag = false;
	}
	
	public int getNumber() {
		return m_nNumber;
	}
}

// Thread 3개를 생성할 통합 클래스
public class SlotMachine {
	public static void main(String[] args) {
		Slot s1 = new Slot("s1");
		Slot s2 = new Slot("s2");
		Slot s3 = new Slot("s3");
		
		boolean bFlg = true;
		
		int n1, n2, n3; // 스레드에서 발생시킨 넘버를 가져와 저장할 변수
		
		s1.start();
		s2.start();
		s3.start();
		
		while(bFlg) {
			n1 = s1.getNumber();
			n2 = s2.getNumber();
			n3 = s3.getNumber();
			
			// 각 스레드에서 발생시킨 숫자를 가져와 변수에 저장하고 출력
			System.out.println(n1 + " " + n2 + " " + n3);
			
			if(n1 != 0) {
				if(n1 == n2 && n2 == n3) {
					System.out.println("당첨");
					bFlg = false;
				}
			}
		}
	}
}