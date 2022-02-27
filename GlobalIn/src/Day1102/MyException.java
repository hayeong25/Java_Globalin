package Day1102;

public class MyException extends Exception {

	private final int ERR_CODE;
	public MyException(String msg, int errCode) {
		super(msg);
		ERR_CODE = errCode; //  생성자를 이용해 초기화
	}
	public MyException(String msg) {
		this(msg, 100); // ERR_CODE 100으로 초기화
	}
	public int getERR_CODE() {
		return ERR_CODE;
	}
}