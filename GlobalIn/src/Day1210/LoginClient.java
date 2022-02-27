package Day1210;

import java.io.*;
import java.net.*;

public class LoginClient {
	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
		
		if(args.length < 2) {
			System.out.println("사용법 : java LoginClient 호스트 주소 포트 번호");
		}
		
		Socket socket = new Socket(args[0], Integer.parseInt(args[1]));
		  
		OutputStream os = socket.getOutputStream();
		InputStream is = socket.getInputStream();
		Protocol protocol = new Protocol();
		byte[] buf = protocol.getPacket();
		  
		while(true) {
			// 소켓의 InputStream으로부터 읽어들여서 바이트 배열 buf에 저장 (서버로부터 온 값)
			is.read(buf);

			int packetType = buf[0];
			protocol.setPacket(packetType, buf);
		   
			if(packetType == Protocol.PT_EXIT) {
				System.out.println("클라이언트 종료");
				break;
			}
		   
			switch(packetType) {
			case Protocol.PT_REQ_LOGIN : // 프로토콜 타입이 로그인 요청일 경우
				System.out.println("서버가 로그인 정보 요청");
				
				BufferedReader userIn = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("아이디 : ");
				String id = userIn.readLine();
				
				System.out.print("비밀번호 : ");
				String pwd = userIn.readLine();

				// 서버로 패킷 전송 (로그인 정보 전송)
				protocol = new Protocol(Protocol.PT_RES_LOGIN);
				protocol.setId(id);
				protocol.setPassword(pwd);
				
				System.out.println("로그인 정보 전송");
				os.write(protocol.getPacket());
				break;
		    
			case Protocol.PT_LOGIN_RESULT :
				System.out.println("서버가 로그인 결과 전송");
				String result = protocol.getLoginResult();

				if(result.equals("1")) {
					System.out.println("로그인 성공");
				}
				else if(result.equals("2")) {
					System.out.println("비밀번호가 틀렸습니다.");
				}
				else if(result.equals("3")) {
					System.out.println("존재하지 않는 아이디입니다.");
				}

				protocol = new Protocol(Protocol.PT_EXIT);
				System.out.println("서버에서 종료 패킷 전송");
				break;
			}
		}

		os.close();
		is.close();
		socket.close();
	}
} 