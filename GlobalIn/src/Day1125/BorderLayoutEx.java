package Day1125;

import java.awt.*;
import Day1124.WinEvent;

public class BorderLayoutEx {
   public static void main(String[] args) {
      Frame f = new Frame("BorderLayout");
      
      Button east = new Button("EAST");
      Button west = new Button("WEST");
      Button center = new Button("CENTER");
      Button south = new Button("SOUTH");
      Button north = new Button("NORTH");
      
      BorderLayout bl = new BorderLayout();
      
      f.add(east, bl.EAST);
      f.add(west, bl.WEST);
      f.add(center, bl.CENTER);
      f.add(south, bl.SOUTH);
      f.add(north, bl.NORTH);
      
//      f.add(west, BorderLayout.WEST);
//      f.add(center, bl.CENTER);
//      f.add("SOUTH", south);
      
      f.setLocation(300, 300);
      f.setSize(200, 200);
      f.setVisible(true);
      
      WinEvent we = new WinEvent();
      f.addWindowListener(we);
   }
}