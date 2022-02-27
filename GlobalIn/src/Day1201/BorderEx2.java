package Day1201;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class BorderEx2 extends JFrame {
	
	private JTextField jtf = new JTextField();
	private Icon icon1 = new ImageIcon("src/Image/ico03.jpg");
	private Icon icon2 = new ImageIcon("src/Image/ico04.jpg");
	private JButton jbt = new JButton("확인", icon1);
	private JLabel jl = new JLabel("Test", JLabel.CENTER);
	
	public BorderEx2() {
		super("BorderEx2");
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		con.add("North", jtf);
		
		TitledBorder tb = new TitledBorder(new EtchedBorder(), "ID", TitledBorder.LEFT, TitledBorder.TOP);
		// TitledBorder(경계선 지정, 타이틀(제목), 타이틀 위치, 타이틀 위치);
		jtf.setBorder(tb);
		
		con.add("Center", jbt);
		
		MatteBorder mb = new MatteBorder(30, 30, 30, 30, icon2);
		jbt.setBorder(mb);
		
		con.add("South", jl);
		
		// 두 개의 경계선이 조합을 이룸
		CompoundBorder cb = new CompoundBorder(new LineBorder(Color.red, 5), new BevelBorder(BevelBorder.RAISED));
		
		jl.setBorder(cb);
		
		setSize(300, 350);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new BorderEx2();
	}
}