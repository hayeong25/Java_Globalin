package Day1125;

import java.awt.*;

import Day1124.WinEvent;

// GridBagLayout : 여러 셀에 겹쳐서 서로 다른 크기와 간격으로 하나의 컴포넌트가 배치될 수 있는 레이아웃

public class GridBagLayoutEx extends Frame {
	
	// 레이아웃 객체 선언
	GridBagLayout gb;
	
	// GridBagLayout을 사용하려면 GridBagConstraints 클래스를 사용해 배치해야 한다
	GridBagConstraints gbc;
	
	public GridBagLayoutEx() {
		super("GridBagLayout");
		
		// GridBagLayout 객체 생성
		gb = new GridBagLayout();
		
		// 레이아웃 설정
		setLayout(gb);
		
		// GridBagConstraints 객체 생성
		gbc = new GridBagConstraints();
		
		// GridBagConstraints 객체의 fill 필드에 GridBagConstraint.BOTH 값을 설정해 좌우로 꽉 채우도록 컴포넌트를 확장하라는 의미
		gbc.fill = GridBagConstraints.BOTH;
		
		addToFrame(new Button("컴포넌트1"), 0, 0, 2, 1, 2.0, 1.0);
		addToFrame(new Button("컴포넌트2"), 2, 0, 1, 1, 0.5, 1.0);
		addToFrame(new Button("컴포넌트3"), 0, 1, 3, 1, 3.0, 1.0);
		addToFrame(new Button("컴포넌트4"), 0, 2, 1, 2, 0.0, 1.0);
		addToFrame(new Button("컴포넌트5"), 1, 2, 2, 1, 0.0, 1.0);
		addToFrame(new Button("컴포넌트6"), 1, 3, 2, 1, 0.0, 1.0);
		
		setBounds(200, 200, 200, 200);
		setVisible(true);
		
		WinEvent we = new WinEvent();
	    addWindowListener(we);
	}
	
	public void addToFrame(Component com, int x, int y, int width, int height, double weightx, double weighty) {
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = width;
		gbc.gridheight = height;
		gbc.weightx = weightx;
		gbc.weighty = weighty;
		
		add(com, gbc);
	}
	
	public static void main(String[] args) {
		new GridBagLayoutEx();
	}
}