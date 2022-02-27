package Day1204;

// Thread 클래스 상속받아 Thread 구현
public class SingleThreadEx extends Thread {

	private int temp[]; // 정수형 배열 생성
	
	
	public SingleThreadEx(String threadname) {
		super(threadname);
		temp = new int[10];
		for (int start = 0; start < temp.length; start++) {
			temp[start] = start;
		}
	}
	
	@Override
	public void run() {
		for(int start : temp) {
			
			try {
				sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			
			System.out.printf("Thread 이름 : %s", currentThread().getName()); // 현재 스레드의 이름 반환
			System.out.printf("temp value :%d\n", start); // 현재 배열이 몇 번째인지
		}
	}
	
	public static void main(String[] args) {
		SingleThreadEx st = new SingleThreadEx("첫 번째");
		st.start();
	}
}
