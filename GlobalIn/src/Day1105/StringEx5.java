package Day1105;

import java.util.StringJoiner;

/*
	MS949 (Window - Preferences - General - Workspace - Encoding)
*/

public class StringEx5 {

	public static void main(String[] args) throws Exception {
		String str = "가";
		byte[] bArr = str.getBytes("UTF-8"); // 한글 3Byte로 변환
		// main에 throws Exception 쓰든지 try catch문으로 예외처리 해야 에러 발생 안 함
		byte[] bArr2 = str.getBytes("CP949"); // MS949와 동일. 2Byte
		System.out.println("UTF-8 : " + joinByteArr(bArr));
		System.out.println("CP949 : " + joinByteArr(bArr2));
	}
	static String joinByteArr(byte[] bArr) {
		StringJoiner sj = new StringJoiner(":", "[", "]");
		for(byte b : bArr)
			sj.add(String.format("%02X", b));
		return sj.toString();
	}
}