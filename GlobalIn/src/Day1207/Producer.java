package Day1207;

// 생산자
public class Producer implements Runnable {

	private Car car; // 생산자와 소비자 클래스는 Car 클래스를 공유함
	
	public Producer(Car car) {
		this.car = car;
	}
	
	@Override
	public void run() {
		String carName = null;
		
		for (int i = 0; i < 20; i++) {
			carName = car.pop();
			
			try {
				// 임의의 시간을 설정해 생산자 스레드와 소비자 스레드가 병행적으로 수행될 수 있도록 sleep() 메소드 사용
				Thread.sleep((int)(Math.random() * 200));
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
}