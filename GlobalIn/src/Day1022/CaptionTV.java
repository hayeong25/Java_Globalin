package Day1022;

public class CaptionTV extends TV {

	boolean caption; // caption 상태는 on/off
	void displayCaption(String text) {
		if(caption) { // 캡션의 상태가 on(true)일 때만 text
			System.out.println(text);
		}
	}
}