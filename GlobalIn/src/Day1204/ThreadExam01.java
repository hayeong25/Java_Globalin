package Day1204;

public class ThreadExam01 implements Runnable {
	
	public void first() {
		System.out.println("first");
		second();
	}
	
	public void second() {
		System.out.println("second");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Start");
		
		Runnable r = new ThreadExam01();
		Thread t = new Thread(r);
		t.start();
		System.out.println("Main End");
	}

	@Override
	public void run() {
		System.out.println("run");
		first();
	}
}