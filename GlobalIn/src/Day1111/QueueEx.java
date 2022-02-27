package Day1111;

import java.util.LinkedList;
import static java.lang.System.out;

public class QueueEx {

	public static void main(String[] args) {
		String[] item = {"소나타", "렉스톤", "재규어", "K9", "제네시스"};
		LinkedList<String> q = new LinkedList<String>();
		for(String n : item) {
			q.offer(n); // q에 데이터 추가
		}
		out.print("q의 크기 : " + q.size());
		String data = "";
		while((data = q.poll()) != null) {
			out.println(data + "삭제");
			out.println("q의 크기 : " + q.size());
		}
	}
}