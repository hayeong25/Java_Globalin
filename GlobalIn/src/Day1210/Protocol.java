package Day1210;

import java.io.*;

public class Protocol implements Serializable {
	
	// 프로토콜이 정의된 프로토콜 타입 설정
	public static final int PT_UNDEFINED = -1; // 프로토콜이 지정되어 있지 않을 경우
	public static final int PT_EXIT = 0;
	public static final int PT_REQ_LOGIN = 1; // 로그인 요청
	public static final int PT_RES_LOGIN = 2; // 인증 요청
	public static final int PT_LOGIN_RESULT = 3; // 인증 결과
	
	public static final int LEN_LOGIN_ID = 20; // ID 길이
	public static final int LEN_LOGIN_PASSWORD = 20; // PW 길이
	public static final int LEN_LOGIN_RESULT = 2; // 로그인 인증값 길이
	public static final int LEN_PROTOCOL_TYPE = 1; // 프로토콜 타입 길이
	public static final int LEN_MAX = 1000; // 서버와 클라이언트 간의 데이터 최대 길이 설정
	
	protected int protocolType;
	private byte[] packet;
	
	public Protocol(){
		this(PT_UNDEFINED);
	}
		 
	//생성자
	public Protocol(int protocolType){
		this.protocolType = protocolType; // 어떤 상수를 생성자에 넣어 Protocol 클래스를 생성하느냐에 따라서 바이트 배열 packet의 length가 결정된다.
		getPacket(protocolType);
	}	 
		 
	public byte[] getPacket(int protocolType){
		if(packet == null){
			switch(protocolType){
			case PT_REQ_LOGIN :
				packet = new byte[LEN_PROTOCOL_TYPE];
				break;
		    case PT_RES_LOGIN :
		    	packet = new byte[LEN_PROTOCOL_TYPE + LEN_LOGIN_ID + LEN_LOGIN_PASSWORD];
		    	break;
		    case PT_UNDEFINED :
		    	packet = new byte[LEN_MAX];
		    	break;
		    case PT_LOGIN_RESULT :
		    	packet = new byte[LEN_PROTOCOL_TYPE + LEN_LOGIN_RESULT];
		    	break;
		    case PT_EXIT :
		    	packet = new byte[LEN_PROTOCOL_TYPE];
		    	break;
			}
		}

		packet[0] = (byte)protocolType; // packet 바이트 배열 첫 번째 요소에 프로토콜 타입 상수 저장
		return packet;
	}

	// 로그인 후 성공/실패의 결과 값을 프로토콜로부터 추출하여 문자열로 리턴
	public String getLoginResult(){
		return new String(packet, LEN_PROTOCOL_TYPE, LEN_LOGIN_RESULT).trim();
				// String(byte[] bytes, int offset, int length)
	}
 
	// String ok를 byte[]로 만들어 packet의 프로토콜 타입 바로 뒤에 추가
	public void setLoginResult(String ok){ // 문자열 ok를 바이트 배열로 변환 후 packet 바이트 배열에 로그인 결과가 저장될 위치에 배열을 복사하는 메소드
		System.arraycopy(ok.trim().getBytes(), 0, packet, LEN_PROTOCOL_TYPE, ok.trim().getBytes().length);
			// arraycopy(Object src, int srcPos, Object dest, int destPos, int length)	
	}
		 
	public void setProtocolType(int protocolType){
		this.protocolType = protocolType;
	}

	public int getProtocolType(){
		return protocolType;
	}
		 
	public byte[] getPacket(){
		return packet;
	}
		 
	// Default 생성자로 생성한 후 Protocol 클래스의 packet 데이터를 바꾸기 위한 메소드
	public void setPacket(int pt, byte[] buf){
		packet = null;
		packet = getPacket(pt);
		protocolType = pt;
		
		System.arraycopy(buf, 0, packet, 0, packet.length);
	}
		 
	public String getId(){
		return new String(packet, LEN_PROTOCOL_TYPE, LEN_LOGIN_ID).trim(); // 패킷 바이트 배열에 저장된 ID 값 반환
	}
		 
	public void setId(String id){ // byte[] packet에 String ID를 byte[]로 만들어 프로토콜 타입 바로 뒷부분에 추가
		System.arraycopy(id.trim().getBytes(), 0, packet, LEN_PROTOCOL_TYPE, id.trim().getBytes().length); // 문자열 ID를 바이트 배열로 변환 후 packet 바이트 배열에 ID가 저장될 위치에 배열 복사
	}

	public String getPassword(){ // 패킷 바이트 배열에 저장된 비밀번호를 반환하는 메소드
		return new String(packet, LEN_PROTOCOL_TYPE + LEN_LOGIN_ID, LEN_LOGIN_PASSWORD).trim();
	}
		 
	public void setPassword(String password){
		System.arraycopy(password.trim().getBytes(), 0, packet, LEN_PROTOCOL_TYPE+LEN_LOGIN_ID, password.trim().getBytes().length);
		packet[LEN_PROTOCOL_TYPE + LEN_LOGIN_ID + password.trim().getBytes().length] = '\0';
	}
}