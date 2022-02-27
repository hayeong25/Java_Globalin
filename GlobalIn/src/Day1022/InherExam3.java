package Day1022;

public class InherExam3 {

	public static void main(String[] args) {

		SubExam3 s3 = new SubExam3();
		s3.print();
		s3.write();
		((SuperExam3)s3).write(); // 서브 메소드 호출
		System.out.println("s3.b :" + s3.b);
		System.out.println("((SuperExam3)s3).b : " + ((SuperExam3)s3).b); // 슈퍼 멤버 변수 호출 (메소드와 다르다)
	}
}