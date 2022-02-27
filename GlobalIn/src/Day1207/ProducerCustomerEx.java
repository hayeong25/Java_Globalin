package Day1207;

public class ProducerCustomerEx {
	public static void main(String[] args) {
		Car c = new Car(); // Car는 생산자 스레드 & 소비자 스레드가 공유하는 자원
		
		Producer producer = new Producer(c); // 생산자 스레드에서 공유자원으로 car 객체 사용
		Thread tProducer = new Thread(producer); // 생산자 스레드 객체 생성
		
		Customer customer = new Customer(c); // 소비자 스레드에서 공유자원으로 car 객체 사용
		Thread tCustomer = new Thread(customer); // 소비자 스레드 객체 생성
		
		tProducer.start();
		tCustomer.start();
	}
}