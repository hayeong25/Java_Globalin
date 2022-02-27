package Day1022;

public class TV { // 부모 클래스 메소드

	boolean power; // 전원 on/off
	int channel; // 채널
	void power() {
		power = !power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}