package Day1210;

import java.io.*;
import java.net.*;

public class LoginServer {
	public static void main(String[] args) throws IOException,  ClassNotFoundException, InterruptedException {

		ServerSocket sSocket = new ServerSocket(3000);
		System.out.println("클라이언트 접속 대기중 ...");
		
		Socket socket = sSocket.accept();
		System.out.println("클라이언트 접속");
		  
		// 바이트 배열로 전송할 것이기 때문에 필터 스트림 없이 Input/OutputStream만 사용해도 된다.
		OutputStream os = socket.getOutputStream();
		InputStream is = socket.getInputStream();

		// 로그인 정보 요청용 프로토콜 객체 생성
		Protocol protocol = new Protocol(Protocol.PT_REQ_LOGIN);
		  
		// 로그인 정보 요청 패킷 전송 
		os.write(protocol.getPacket());
		  
		while(true){
			// 새 Protocol 객체 생성 (기본 생성자)
			protocol = new Protocol();
		   
			// 기본 생성자로 생성할 때에는 바이트 배열의 길이가 1000으로 지정됨
			byte[] buf = protocol.getPacket();
		   
			// socket으로부터 읽어서 buf에 저장 (블로킹 메소드)
			is.read(buf);
		   
			// 패킷 타입을 얻어와 Protocol 객체의 packet 멤버 변수에 buf 복사
			int packetType = buf[0];
			protocol.setPacket(packetType, buf);
		   
			if(packetType == Protocol.PT_EXIT) {
			    protocol = new Protocol(Protocol.PT_EXIT);
			    os.write(protocol.getPacket());
			    System.out.println("서버 종료");
			    break;
			}
		  
			switch(packetType){
			case Protocol.PT_RES_LOGIN : // 클라이언트가 로그인 정보 응답 패킷인 경우 (클라이언트의 로그인 정보 전송일 경우)
				System.out.println("클라이언트가 로그인 정보를 보냈습니다.");
				String id = protocol.getId();
				String password = protocol.getPassword();
				System.out.println(id + "@@" + password + "@@");
		    
				if(id.equals("localhost")) {
					if(password.equals("1111")) { // 로그인 성공
						protocol = new Protocol(Protocol.PT_LOGIN_RESULT);
						protocol.setLoginResult("1");
						System.out.println("로그인 성공");
					}
					else { // 패스워드 틀렸을 경우
						protocol = new Protocol(Protocol.PT_LOGIN_RESULT);
						protocol.setLoginResult("2");
						System.out.println("패스워드 틀림");
					}
				}
				else { // ID가 존재하지 않을 경우
					protocol = new Protocol(Protocol.PT_LOGIN_RESULT);
					protocol.setLoginResult("3");
					System.out.println("아이디 존재 안함");
				}
		   
				System.out.println("로그인 처리 결과 전송");
				os.write(protocol.getPacket()); // socket의 OutputStream에 기록
				break;
			}
		}

		is.close();
		os.close();
		socket.close();
	}
}