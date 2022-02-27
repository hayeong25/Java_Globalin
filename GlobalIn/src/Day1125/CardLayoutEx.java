package Day1125;

import java.awt.*;
import Day1124.WinEvent;

public class CardLayoutEx extends Frame {
   
   // cardlayout 선언
   CardLayout card;
   // card 역할을 하는 panel의 멤버변수 선언
   Panel first_panel, second_panel, third_panel;
   
   
   public CardLayoutEx() {
      super("CardLayout");
      
      // cardlayout 객체 생성
      card = new CardLayout();
      
      // layout 설정
      setLayout(card);
      
      // 첫번째 패널 객체 생성
      first_panel = new Panel();
      
      // 패널에 버튼 추가
      first_panel.add(new Button("1"));
      first_panel.add(new Button("2"));
      
      // 두번째 패널 객체 생성
      second_panel = new Panel();
      
      // 패널에 버튼 추가
      second_panel.add(new Button("3"));
      second_panel.add(new Button("4"));
      
      // 세번째 패널 객체 생성
      third_panel = new Panel();
      
      // 패널에 버튼 추가
      third_panel.add(new Button("5"));
      third_panel.add(new Button("6"));
      
      // 패널을 프레임에 추가
      add("1", first_panel);
      add("2", second_panel);
      add("3", third_panel);
      
      WinEvent we = new WinEvent();
      addWindowListener(we);
   }
   
   public void rotate() {
	   for (int i = 0; i < 2; i++) {
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			card.next(this); // 현재 객체
	   }
   }
   
   public static void main(String[] args) {
	   CardLayoutEx cit = new CardLayoutEx();
	   
	   // 위치와 크기를 통합한 메소드
	   cit.setBounds(200, 200, 200, 100);
	   cit.setVisible(true);
	   
	   cit.rotate();
   }
}