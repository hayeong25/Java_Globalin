package Day1130;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ConfirmButtonActionListener implements ActionListener{
   
   JTextField text;
   JLabel label;
   
   public ConfirmButtonActionListener(JTextField text, JLabel label) {
      this.text = text;
      this.label = label;
   }
   
   @Override
   public void actionPerformed(ActionEvent e) {
      String name = text.getText();
      label.setText("Hello" + name);
   }
}