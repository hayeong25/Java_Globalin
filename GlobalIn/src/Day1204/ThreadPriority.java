package Day1204;

public class ThreadPriority extends Thread {

	public ThreadPriority(String threadName) {
		super(threadName);
	}
	
	@Override
	public void run() {
		System.out.printf("Thread Name : %s\n", Thread.currentThread().getName());
	}
}
