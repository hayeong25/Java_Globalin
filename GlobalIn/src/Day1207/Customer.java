package Day1207;

// 소비자
public class Customer implements Runnable {

	private Car car;
	
	public Customer(Car car) {
		this.car = car;
	}
	
	@Override
	public void run() {
		String carName = null;
		
		for (int i = 0; i < 20; i++) {
			carName = car.getCar();
			car.push(carName);
			
			try {
				Thread.sleep((int)(Math.random() * 200));
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
}