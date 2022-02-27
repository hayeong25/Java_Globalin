package Day1202;

import javax.swing.*;
import java.util.*;

public class JTreeEx extends JFrame {
	
	// JTree에 들어갈 요소들을 가지고 있는 배열 객체 생성
	Object[] gen = {"Programming", "System", "Design"};
	
	// 벡터 객체를 생성해서 하위 요소로 들어갈 멤버 벡터 객체 생성
	// 각 벡터들이 기억할 수 있는 문자열을 벡터에 추가
	Vector<Vector> node1 = new Vector<Vector>() {
		@Override
		public String toString() {
			return "Lesson";
		}
	};
	
	Vector<String> node2 = new Vector<String>() {
		@Override
		public String toString() {
			return "Java";
		}
	};
	
	Vector<String> node3 = new Vector<String>() {
		@Override
		public String toString() {
			return "XML";
		}
	};
	
	public JTreeEx() {
		
		node1.addElement(node2);
		node1.addElement(node3);
		
		node2.addElement("HTML");
		node2.addElement("CSS");
		node2.addElement("JavaScript");
		
		node3.addElement("Servlet");
		node3.addElement("JSP");
		
		// 자원 바꾸기. gen 배열 첫 번째 원소인 Programming이라는 String 객체가 node1이라는 벡터 객체로 대체됨
		gen[0] = node1;
		
		// gen 배열로 JTree 객체 생성
		JTree tree = new JTree(gen);
		
		// JTree의 메소드인 setRootVisible() 호출해 루트 노드가 보이도록 설정
		tree.setRootVisible(true);
		
		// tree 객체로 JScrollPane 객체 생성
		JScrollPane js = new JScrollPane(tree);
		
		// 프레임에 추가
		add(js);
		
		setBounds(300, 150, 400, 350);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JTreeEx();
	}
}