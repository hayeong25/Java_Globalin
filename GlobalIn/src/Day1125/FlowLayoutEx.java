package Day1125;

import java.awt.*;
import Day1124.WinEvent;

public class FlowLayoutEx {
   public static void main(String[] args) {
      Frame f = new Frame("FlowLayout");
      Panel p = new Panel();
      
      WinEvent we = new WinEvent();
      f.addWindowListener(we);
       
      Button b1 = new Button("버튼1");
      Button b2 = new Button("버튼2");
      Button b3 = new Button("버튼3");
      Button b4 = new Button("버튼4");
      Button b5 = new Button("버튼5");
      
      b1.setSize(10, 20);
      b2.setSize(20, 30);
      b3.setSize(30, 40);
      b4.setSize(40, 50);
      b5.setSize(50, 60);
      // 생성된 버튼을 패널에 추가
      p.add(b1);
      p.add(b2);
      p.add(b3);
      p.add(b4);
      p.add(b5);
      
      // 패널을 프레임에 추가
//      f.add(b1);
//      f.add(b2);
//      f.add(b3);
//      f.add(b4);
//      f.add(b5);
         // 결과 : 버튼5만 추가됨
      f.add(p);
      
      f.setLocation(600, 600);
      f.setSize(600, 600);
      f.setVisible(true);

   }
}