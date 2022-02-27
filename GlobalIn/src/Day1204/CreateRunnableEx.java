package Day1204;

// 인터페이스를 이용해 Thread 구현
public class CreateRunnableEx implements Runnable {

	private int[] temp;
	
	public CreateRunnableEx() {
		temp = new int[10];
		
		for (int start = 0; start < temp.length; start++) {
			temp[start] = start;
		}
	}
	
	@Override
	public void run() {
		for(int start : temp) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			
			// 현재 스레드의 이름 반환. static 메소드이기 때문에 클래스 이름을 이용해 호출해야 한다
			System.out.printf("Thread 이름 : %s", Thread.currentThread().getName());
			System.out.printf("temp value :%d\n", start); // 현재 배열이 몇 번째인지
		}
	}
	
	public static void main(String[] args) {
		CreateRunnableEx cr = new CreateRunnableEx();
		Thread t = new Thread(cr, "첫 번째"); // Thread 객체 생성
		// Runnable 인터페이스를 사용한 경우, Thread(Runnable r, String name) 생성자 사용 
		t.start();
	}
}