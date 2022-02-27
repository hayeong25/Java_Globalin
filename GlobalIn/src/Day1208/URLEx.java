package Day1208;

import java.io.*;
import java.net.*;

public class URLEx {
	public static void main(String[] args) throws MalformedURLException, IOException {
		// 프로토콜, 호스트, 포트, 경로와 쿼리 및 참조
		URL url = new URL("http", "java.sum.com", 8800, "index.jsp?name=gildong#content");
		
		String protocol = url.getProtocol();
		String host = url.getHost();
		int port = url.getPort(); // 포트 번호가 명시되지 않았을 경우 -1을 반환함
		int defaultPort = url.getDefaultPort(); // getDefaultPort() : 프로토콜에 대응하는 포트 번호를 숫자로 반환
		// http : 80, FTP : 21, Telnet : 23
		
		System.out.println("프로토콜 : " + protocol);
		System.out.println("호스트 : " + host);
		System.out.println("포트 번호 : " + port);
		System.out.println("기본 포트 번호 : " + defaultPort);
		
		String path = url.getPath(); // url 경로 반환
		String query = url.getQuery(); // url 쿼리를 문자열로 반환
		String ref = url.getRef(); // url 레퍼런스를 문자열로 반환
		
		String _url = url.toExternalForm(); // url을 문자열로 반환
		
		String mixUrl = null;
		if(port == -1) { // 포트가 없는 경우 mixUrl 값에 포트를 연결하지 않음
			mixUrl = protocol + "//" + host + path + "?" + query + "#" + ref;
		}
		else { // 포트가 명시된 경우, mixUrl 값에 포트 연결
			mixUrl = protocol + "//" + host + path + "?" + query + "#" + ref;
		}
		
		if(port == -1) {
			port = url.getDefaultPort();
		}
		
		System.out.println("프로토콜 : " + protocol);
		System.out.println("호스트 : " + host);
		System.out.println("포트 번호 : " + port);
		System.out.println("경로 : " + path);
		System.out.println("쿼리 : " + query);
		System.out.println("ref : " + ref);
		System.out.println("mixUrl : " + mixUrl);
		System.out.println("URL : " + url);
		
		url = new URL("http://www.naver.com");
		
		System.out.println();
		
		InputStream input = url.openStream(); // url 자원을 가져옴
		int readByte;
		System.out.println("============== 문서 내용 ==============");
		while((readByte = input.read()) != -1) {
			System.out.print((char)readByte);
		}
		input.close();
	}
}