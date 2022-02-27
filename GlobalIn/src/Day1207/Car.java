package Day1207;

import java.util.*;

// 공유자원 car
public class Car {
	
	// car를 저장한 List 선언
	private List<String> carList = null;
	
	public Car() {
		// carList 객체 생성
		carList = new ArrayList<String>();
	}
	
	public String getCar() {
		String carName = null;
		
		switch((int)(Math.random() * 3)) {
		case 0 :
			carName = "마세라티";
			break;
		case 1 :
			carName = "에쿠스";
			break;
		case 2 :
			carName = "제네시스";
			break;
		}
		
		return carName;
	}
	
	// car 소비 메소드. 동기화 해야만 소비자의 car가 없는 대기 상태로 이동.
	public synchronized String pop() {
		String carName = null;
		
		if(carList.size() == 0) {
			try {
				System.out.println("car가 없습니다. 생산할 때까지 기다려주십시오.");
				this.wait();
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		
		// car가 있을 경우
		carName = (String)carList.remove(carList.size()-1); // List에서 하나 삭제
		
		System.out.println("고객이 car를 구매하셨습니다. 구매하신 차량의 이름은 " + carName + "입니다.");
		
		return carName;
	}
	
	// car 생산 메소드. car가 없는 경우 현재 스레드가 대기 상태로 이동
	public synchronized void push(String car) {
		carList.add(car);
		
		System.out.println("car가 만들어졌습니다. car의 이름은 " + car + "입니다.");
		
		if(carList.size() == 5) {
			// car가 5대 있을 경우 대기 상태에 있는 소비자를 꺠움. 대기 상태에 있는 소비자가 없으면 아무런 동작을 취하지 않음
			this.notify(); // notify()가 없으면 교착 상태 발생
		}
	}
}