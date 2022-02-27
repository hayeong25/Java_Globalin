package Day1204;

public class MultiThreadEx implements Runnable {

	@Override
	public void run() {
		int first = 0;
		int second = 0;
		
		for (int i = 0; i < 20; i++) {
			first++;
			second++;
			
			System.out.printf("first : %d", first);
			System.out.printf("second : %d", second);
			
			System.out.printf("Thread Name : %s\n", Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		MultiThreadEx srt1 = new MultiThreadEx();
		Thread firstThread = new Thread(srt1, "첫 번째 스레드");
		firstThread.start();
		
		MultiThreadEx srt2 = new MultiThreadEx();
		Thread secondThread = new Thread(srt2, "두 번째 스레드");
		secondThread.start();
		
		// 결과 예측 불가
	}
}