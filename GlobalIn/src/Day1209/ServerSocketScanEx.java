package Day1209;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.net.*;

public class ServerSocketScanEx extends JFrame implements ActionListener, Runnable {

	private JButton jbtn_scan;
	private JTextField jtf_ip;
	private JList jlist_result;
	private JLabel jlabel_ip;
	private DefaultListModel listmodel;
	private int index;
	private String ip;
	
	public ServerSocketScanEx(String message) {
		super(message);
		
		jbtn_scan = new JButton("서버 스캔");
		listmodel = new DefaultListModel();
		jlist_result = new JList(listmodel);
		jlist_result.setVisibleRowCount(10); // list의 결과로 10개의 행을 보여주도록 함
		
		JPanel jpanel_south = new JPanel();
		jpanel_south.add(jbtn_scan);
		
		jbtn_scan.addActionListener(this);
		
		JScrollPane js = new JScrollPane(jlist_result);
		
		add(js, BorderLayout.CENTER);
		add(jpanel_south, BorderLayout.SOUTH);
		
		pack();
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	@Override
	public void run() {
		ServerSocket s = null;
        
		for(int i = 1; i < 65536; i++){
            try{
                s = new ServerSocket(i);
                // ServerSocket 객체가 생성되면 로컬 시스템의 어떤 프로세스도 해당 포트 번호를 사용할 수 없음
            }catch(IOException io){ // 예외 발생 : 로컬 시스템의 특정 프로세스가 포트를 사용한다는 의미
                listmodel.insertElementAt(i + "번 포트가 사용 중입니다", index);
                jlist_result.setSelectedIndex(index);    
            }        
        }
		
        listmodel.insertElementAt("서버 스캔이 끝났습니다.", index);
        jlist_result.setSelectedIndex(index);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource(); // 이벤트 발생 시 발생한 컴포넌트를 객체 타입으로 반환
		
		if(obj== jbtn_scan) {
			listmodel.insertElementAt(ip, index);
			jlist_result.setSelectedIndex(index);
			index++;
			Thread t = new Thread(this);
			t.start();
		}
	}
	
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		new ServerSocketScanEx("ServerPort Scanner");
	}
}