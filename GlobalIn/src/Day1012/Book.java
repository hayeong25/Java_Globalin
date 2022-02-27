package Day1012;

public class Book {

	// 멤버필드(변수), 속성
	String name; // 책 제목 저장할 필드
	String writer; // 저자 저장할 필드
	int price; // 책 가격
	int nowPage; // 현재 페이지
	String isbn; // 일련번호
	public String getName() {
		return name;
	}

	public String getWriter() {
		return writer;
	}

	public int getPrice() {
		return price;
	}

	public int getNowPage() {
		return nowPage;
	}

	public String getIsbn() {
		return isbn;
	}

	public Book() { // 생성자 함수
	}
	public void nextPage() {
		nowPage++; // 현재페이지
	}
	public void previousPage() {
		nowPage--; // 이전페이지
	}
}