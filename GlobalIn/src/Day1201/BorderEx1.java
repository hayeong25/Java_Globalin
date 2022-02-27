package Day1201;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class BorderEx1 extends JFrame {
	
	private JButton[] jb = new JButton[6];
	
	public BorderEx1() {
		super("Border");
		Container con = this.getContentPane();
		
		// 레이아웃 설정
		con.setLayout(new GridLayout(3, 2, 5, 5)); // 행과 열의 크기를 잡고 컴포넌트 사이의 간격 설정
		
		for (int i = 0; i < jb.length; i++) {
			jb[i] = new JButton((i+1) + "번 버튼");
			con.add(jb[i]);
		}
		
		// EmptyBorder : 아무런 선이나 그림이 없는 빈 공간만 차지하는 경계선
		// EmptyBorder 객체 생성 - 생성자를 통해서 경계선 설정
		EmptyBorder eb = new EmptyBorder(10, 10, 10, 10);
		jb[0].setBorder(eb); // 버튼에 경계선 설정
		// 생성자를 통해 색상과 굵기 설정
		LineBorder lb = new LineBorder(Color.red, 5);
		jb[1].setBorder(lb);
		
		// 평면을 날카로운 끌로 판듯이 선을 보여주는 경계선
		EtchedBorder eb1 = new EtchedBorder();
		jb[2].setBorder(eb1);
		
		// BevelBorder : 3차원 효과 경계선
		BevelBorder bb = new BevelBorder(BevelBorder.RAISED); // RAISED : 볼록한 모양
		jb[3].setBorder(bb);
		
		SoftBevelBorder sbb = new SoftBevelBorder(SoftBevelBorder.LOWERED); // LOWERED : 움푹 파인 모양
		jb[4].setBorder(sbb);
		
		MatteBorder mb = new MatteBorder(5, 10, 15, 20, Color.green);
		jb[5].setBorder(mb);
		
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new BorderEx1();
	}
}