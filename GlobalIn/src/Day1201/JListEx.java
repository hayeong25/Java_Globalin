package Day1201;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Day1124.List;

import java.util.*;

public class JListEx extends JFrame {
	
	public JListEx() {
		super("JList");
		
		setLayout(new FlowLayout()); // 레이아웃 설정
		String[] listData = {"pk", "hong", "Java", "Data", "JSP"}; // 리스트에 추가할 데이터를 배열로 설정하고 데이터 추가
		JList list1 = new JList(listData); // 추가한 데이터를 리스트에 추가
		list1.setSelectedIndex(2); // JList의 index 리스트를 선택하도록 설정하는 메소드
		
		JList list2 = new JList(new DefaultListModel()); // DefaultListModel로 JList 객체 생성
		// DefaultListModel로 객체를 반환하는 메소드는 getModel()
		DefaultListModel model = (DefaultListModel)list2.getModel();
		
		model.addElement("사과"); // model에 자료 추가할 떄 addElement() 메소드 사용
		model.addElement("딸기");
		model.addElement("바나나");
		model.addElement("수박");
		list2.setSelectedIndex(1);
		
		Vector vListData = new Vector(); // 벡터 객체 생성
		JList list3 = new JList(vListData); // 생성한 객체를 리스트에 추가
		// 벡터에 자료를 추가하면 자동으로 JList의 리스트로 추가됨
		JScrollPane scroll = new JScrollPane(list3); // list3을 JScrollPane에 포함시켜 자동으로 스크롤 할 수 있도록 함
		vListData.add("축구");
		vListData.add("야구");
		vListData.add("농구");
		vListData.add("배구");
		vListData.add("테니스");
		vListData.add("수영");
		vListData.add("육상");
		vListData.add("태권도");
		vListData.add("유도");
		vListData.add("검도");
		
		class Student { // JList에 추가할 student 클래스(내부 클래스)
			String id;
			String name;
			String department;
			
			public Student(String id, String name, String department) {
				this.id = id;
				this.name = name;
				this.department = department;
			}
			
			@Override
			public String toString() {
				return name;
			}
		}
		
		JList list4 = new JList(new DefaultListModel()); // DefaultListModel로 리스트 객체 생성
		
		list4.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // 단일 선택만 가능하도록 설정
		// SINGLE_SELECTION : 한 가지 항목만 선택할 수 있다.
	    // SINGLE_INTERVAL_SELECTION : 복수 개의 항목들을 선택할 수 있으나, 이들은 리스트 내에서 연속적으로 놓여야 한다.
	    // MULTIPLE_INTERVAL_SELECTION : 복수 개의 항목들을 선택할 수 있으며, 항목들의 위치에 아무 제한이 없다.
		
		model = (DefaultListModel)list4.getModel();
		
		// student 객체를 매개변수로 하여 모델에 자료 추가
		model.addElement(new Student("100", "찬료리", "컴퓨터공학과"));
		model.addElement(new Student("200", "곰탱이", "수학과"));
		model.addElement(new Student("300", "꼬물이", "전자과"));
		model.addElement(new Student("400", "참렬쓰", "경제학과"));
		list4.setSelectedIndex(0);
		
		// 리스트를 프레임에 추가
		add(list1);
		add(list2);
		add(scroll);
		add(list4);
		
		setBounds(300, 200, 300, 220);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JListEx();
	}
}