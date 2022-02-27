package Day1105;

public class StringBufferEx2 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("1234567890");
		System.out.println("sb의 Buffer 용량은 : " + sb.capacity()); // 26
		// 기본 Buffer 용량은 16
		// 기본 용량 16에 "1234567890"은 10글자이므로 16+10 = 26
		System.out.println("sb 문자열의 길이 : " + sb.length()); // 10
		sb.append("ABCDEFGHIJKLMNOPQ");
		// 기존 버퍼에 버퍼 하나가 같은 용량으로 늘어나고 버퍼가 2개이므로 용량은 26+26+2=54
		System.out.println("sb의 Buffer 용량은 : " + sb.capacity()); // 54
		System.out.println("sb 문자열의 길이 : " + sb.length()); // 27
		sb.delete(1, 20);
		System.out.println("sb의 Buffer 용량은 : " + sb.capacity()); // 54
		System.out.println("sb 문자열의 길이 : " + sb.length()); // 8
		// 버퍼 용량은 한 번 커지면 줄어들진 않는다. 길이만 줄어들 뿐
	}
}