package Day1204;

public class ThreadPriorityExam extends ThreadPriority {

	public ThreadPriorityExam(String threadName) {
		super(threadName);	
	}

	public static void main(String[] args) {
		Thread t1 = new ThreadPriority("첫 번째 스레드"); // ThreadPriority 클래스는 슈퍼 클래스가 Thread이기 때문에 객체 생성 가능
		t1.setPriority(Thread.MIN_PRIORITY); // 우선 순위 가장 낮게 설정
		t1.start();
		
		Thread t2 = new ThreadPriority("두 번째 스레드");
		t2.start();
	}
}