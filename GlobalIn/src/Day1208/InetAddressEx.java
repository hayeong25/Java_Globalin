package Day1208;

import java.net.*;

/*
	URL : https://www.daum.net:80/member/mem.jsp?id=zzz&pw=aaa
	
	https : 프로토콜
	www.daum.net : 호스트 주소
	80 : port
	member/mem.jsp : path
	id=zzz&pw=aaa : query
*/

public class InetAddressEx {
	public static void main(String[] args) throws UnknownHostException {
		// 로컬 호스트를 이용한 InetAddress 객체 생성
		InetAddress iadrr = InetAddress.getLocalHost();
		
		// 호스트의 이름을 문자열로 반환
		System.out.printf("호스트 이름 : %s\n", iadrr.getHostName());
		
		// 호스트의 IP 주소를 문자열로 반환
		System.out.printf("호스트 IP 주소 : %s\n", iadrr.getHostAddress());
		
		System.out.println();
		
		// Naver
		iadrr = InetAddress.getByName("www.naver.com");
		System.out.printf("호스트 이름 : %s\n", iadrr.getHostName());
		System.out.printf("호스트 IP 주소 : %s\n", iadrr.getHostAddress());
		
		// Daum
		InetAddress ia[] = InetAddress.getAllByName("www.daum.net");
		for(InetAddress ss : ia) {
			System.out.printf("호스트 이름 : %s\n", ss.getHostName());
			System.out.printf("호스트 IP 주소 : %s\n", ss.getHostAddress());
		}
	}
}