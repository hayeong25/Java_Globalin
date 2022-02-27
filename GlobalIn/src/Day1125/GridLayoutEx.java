package Day1125;

import java.awt.*;
import Day1124.WinEvent;

public class GridLayoutEx extends Frame{
   
   private String[] str = {"7", "8", "9", "4", "5", "6", "1", "2", "3", "*", "0", "#"};
   private Button[] bt = new Button[str.length];
   
   public GridLayoutEx() {
      super("GridLayout");
      
      // GridLayout(행, 열, 행간격, 열간격)
      setLayout(new GridLayout(4,3,15,15));
      
      for(int i = 0; i < bt.length; i++) {
         bt[i] = new Button(str[i]);
         add(bt[i]);
      }
      
      setSize(300, 200);
      setVisible(true);
      
      WinEvent we = new WinEvent();
      addWindowListener(we); // 종료 버튼 이벤트
   }
   
   public static void main(String[] args) {
      new GridLayoutEx();
   }
}