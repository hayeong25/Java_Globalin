package Day1204;

public class JoinEx {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + "start");
		
		Runnable r = new MyRunnableEx();
		Thread t = new Thread(r);
		t.start();
		
		try {
			t.join();
			// join()은 InterruptedException 예외를 발생시키기 때문에 반드시 예외 처리 해야 한다
			// join()은 이 메소드를 호출한 스레드가 종료할 때까지 현재 스레드를 기다리게 함
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + "end");
		// 메인이 시작된 후 스레드 시작. 스레드가 join() 호출했기 때문에 스레드가 종료할 때까지 기다리고 나서 스레드 종료 후 메인 종료 
	}
}