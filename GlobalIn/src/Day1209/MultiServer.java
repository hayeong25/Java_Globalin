package Day1209;

import java.io.*;
import java.net.*;
import java.util.*;

public class MultiServer {
    
	private ArrayList<MultiServerThread> list; // 클라이언트와 접속 시 지속적으로 대화하기 위해 Runnable 객체를 생성하는데, 이를 저장하기 위한 변수
	private Socket socket; // 클라이언트 접속 시 accept() 메소드에 의해 생성된 socket 변수 선언
    
	public MultiServer() throws IOException {
		list = new ArrayList<MultiServerThread>();
		ServerSocket serverSocket = new ServerSocket(5000);
		MultiServerThread mst = null;
		boolean isStop = false;
        
		while(!isStop) {
			System.out.println ("Server ready...");
			socket = serverSocket.accept(); // accept() 메소드를 이용해 클라이언트의 연결을 기다림
			mst = new MultiServerThread(this);
			list.add(mst);
			Thread t = new Thread(mst);
			t.start();
		}
	}
     
	public ArrayList<MultiServerThread> getList() {
		return list;
	}
     
	public Socket getSocket() {
		return socket;
	}
     
	public static void main(String arg[]) throws IOException {
		new MultiServer();
	}
}