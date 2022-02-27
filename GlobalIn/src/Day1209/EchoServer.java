package Day1209;

import java.io.*;
import java.net.*;

public class EchoServer {
	private BufferedReader bufferR;
	private BufferedWriter bufferW;
	
	private InputStream is;
	private OutputStream os;
	
	private ServerSocket serverS;
	
	public EchoServer(int port) {
		try{
			serverS = new ServerSocket(port);
		} catch(IOException io) {
			io.printStackTrace();
			System.exit(0);
		}

		while(true){
			try{
				System.out.println("클라이언트를 요청을 기다리는 중");
				Socket tcpSocket = serverS.accept(); // 소켓을 생성하고 accept() 메소드를 호출해 클라이언트의 접속을 기다림

				// 서버에 클라이언트가 접속되면 서버는 클라이언트의 주소를 알아냄
				System.out.println("클라이언트의 IP 주소 : " + tcpSocket.getInetAddress().getHostAddress());
				// Socket 객체를 이용해 입력 스트림과 출력 스트림 생성
				is = tcpSocket.getInputStream();
				os = tcpSocket.getOutputStream();
				
				bufferR = new BufferedReader(new InputStreamReader(is));
	            bufferW = new BufferedWriter(new OutputStreamWriter(os));               

	            String message = bufferR.readLine(); // message를 읽어옴
	            System.out.println("수신메시지 : " + message);
	            message = message + System.getProperty("line.separator"); // 현재 시스템에서 한 줄의 끝을 표시할 수 있는 문자

	            bufferW.write(message);
	            bufferW.flush(); // flush() : 버퍼에 있는 데이터를 모두 파일에 쓴 후 버퍼를 비우는 메소드
	            
	            bufferR.close();
	            bufferW.close();
	            tcpSocket.close();
			} catch(IOException io) {
				io.printStackTrace();
			}
		}   
	}
	
	public static void main(String[] args){
		new EchoServer(3000);
	}
}