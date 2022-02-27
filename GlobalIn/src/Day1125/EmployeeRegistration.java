package Day1125;

import java.awt.*;

class Employee extends Frame {
	public Employee() {
		super("사원 등록");
		Color cr = new Color(213, 240, 244);
		setBackground(cr);
		
		Panel A = new Panel(new FlowLayout(FlowLayout.LEFT));
		Panel B = new Panel(new FlowLayout(FlowLayout.LEFT));
		Panel C = new Panel(new FlowLayout(FlowLayout.LEFT));
		Panel D = new Panel(new FlowLayout(FlowLayout.LEFT));
		Panel E = new Panel(new FlowLayout(FlowLayout.LEFT));
		Panel F = new Panel(new BorderLayout());
		Panel G = new Panel();
		
		Panel p1 = new Panel(new BorderLayout());
		Panel p2 = new Panel(new BorderLayout());
		Panel p3 = new Panel(new BorderLayout());
		
		Label name = new Label("성명");
		TextField name2 = new TextField(6);
		Label sex = new Label("성별");
		CheckboxGroup cc = new CheckboxGroup();
		Checkbox man = new Checkbox("남성", cc, true);
		Checkbox woman = new Checkbox("여성", cc, false);
		
		A.add(name);
		A.add(name2);
		A.add(sex);
		A.add(man);
		A.add(woman);
		
		Label jumin = new Label("주민번호");
		Label da = new Label("-", Label.CENTER);
		TextField jumin2 = new TextField(6);
		TextField jumin3 = new TextField(7);
		
		B.add(jumin);
		B.add(jumin2);
		B.add(da);
		B.add(jumin3);
		
		Label juso = new Label("주소");
		TextField juso2 = new TextField(28);
		C.add(juso);
		C.add(juso2);
		
		p1.add(A, BorderLayout.NORTH);
		p1.add(B, BorderLayout.CENTER);
		p1.add(C, BorderLayout.SOUTH);
		add(p1, BorderLayout.NORTH);
		
		Label boosu = new Label("부서");
		Choice ch = new Choice();
		ch.addItem("기획부");
		ch.addItem("관리부");
		ch.addItem("총무부");
		ch.addItem("생산부");
		D.add(boosu);
		D.add(ch);
		
		Label chimi = new Label("취미");
		Checkbox ch1 = new Checkbox("운동", true);
		Checkbox ch2 = new Checkbox("음악감상");
		Checkbox ch3 = new Checkbox("영화");
		Checkbox ch4 = new Checkbox("컴퓨터");
		E.add(chimi);
		E.add(ch1);
		E.add(ch2);
		E.add(ch3);
		E.add(ch4);
		
		p2.add(D, BorderLayout.NORTH);
		p2.add(E, BorderLayout.CENTER);
		add(p2, BorderLayout.CENTER);
		
		Label soge = new Label("자기소개");
		TextArea soge2 = new TextArea();
		F.add(soge, BorderLayout.NORTH);
		F.add(soge2, BorderLayout.CENTER);
		
		Button save = new Button("저장");
		Button exit = new Button("종료");
		G.add(save);
		G.add(exit);
		
		p3.add(F, BorderLayout.NORTH);
		p3.add(G, BorderLayout.CENTER);
		add(p3, BorderLayout.SOUTH);
		
		setSize(350, 430);
		setVisible(true);
	}
}

public class EmployeeRegistration {
	public static void main(String[] args) {
		Employee pa = new Employee();
	}
}