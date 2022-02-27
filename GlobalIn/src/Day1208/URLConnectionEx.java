package Day1208;

import java.io.*;
import java.net.*;
import java.util.*;

public class URLConnectionEx {
	public static void main(String[] args) throws Exception {
		URL url = new URL("https://docs.oracle.com/javase/8/docs/api");
		
		// URLConnection 클래스의 openConnection() 메소드를 이용해 객체 생성
		URLConnection urlCon = url.openConnection();
		
		// URLConnection 클래스의 connect() 메소드를 호출해야만 객체 완성됨
		urlCon.connect();
		
		Map<String, List<String>> map = urlCon.getHeaderFields();
		// getHeaderFields() : 원격 서버의 모든 헤더 필드를 Map 객체로 반환
		// 헤더 필드는 key와 value 형태로 이루어져 있기 때문에 Map 객체로 반환됨
		
		// 헤더 필드에 있는 모든 key를 Set 객체로 반환
		Set<String> s = map.keySet();
		
		// Set 객체는 key 값을 바로 가져올 수 없기에 iterator() 메소드를 사용해 Iterator 타입으로 변환시켜야 한다.
		Iterator<String> iterator = s.iterator();
		
		while(iterator.hasNext()) { // iterator에 key가 있을 경우 true
			String name = iterator.next(); // iterator에 있는 key 값을 가져와 name 변수에 저장
			System.out.print(name + " : ");
			List<String> value = map.get(name);
			
			for(String _temp : value) {
				System.out.println(_temp);
			}
		}
		
		int len = urlCon.getContentLength();
		System.out.println("문서 길이 : " + len + "바이트");
		
		if(len > 0) { // 문서의 내용이 있는 경우
			InputStream input = urlCon.getInputStream();
			int readByte;
			
			System.out.println("======== 문서 내용 ========");
			while(((readByte = input.read()) != -1) && (--len > 0)) {
				System.out.print((char)readByte);
			}
			input.close();
		}
		else {
			System.out.println("문서의 내용이 없습니다.");
		}
	}
}