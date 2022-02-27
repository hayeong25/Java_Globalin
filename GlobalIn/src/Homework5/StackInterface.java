package Homework5;

interface StackInterface {
	int length(); // 스택에 들어 있는 문자열 개수 리턴
	String pop(); // 스택의 탑에 있는 문자열 팝
	boolean push(String ob); // 스택의 탑에 문자열 ob 푸시 삽입	
}