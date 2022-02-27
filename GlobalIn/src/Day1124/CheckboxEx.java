package Day1124;

import java.awt.*;

public class CheckboxEx {
	public static void main(String[] args) {
		Frame f = new Frame("체크박스");
		Panel p = new Panel();
		WinEvent we = new WinEvent();
		f.addWindowListener(we);
		
		Checkbox ck1 = new Checkbox("영화", true); // true는 선택. false는 아무 것도 아닌 상태
		// state : 이 버튼을 선택할 것인지 선택하지 않을 것인지 선택 여부 지정할 때 사용
		Checkbox ck2 = new Checkbox("스포츠");
		Checkbox ck3 = new Checkbox("여행");
		
		// 체크 박스를 패널에 추가
		p.add(ck1);
		p.add(ck2);
		p.add(ck3);
		
		// 패널을 프레임에 추가
		f.add(p);
		
		f.setSize(300, 100);
		f.setVisible(true);
	}
}