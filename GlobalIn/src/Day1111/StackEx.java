package Day1111;

import java.util.Stack;
import static java.lang.System.out;

public class StackEx {

	public static void main(String[] args) {
		String[] groupA = {"대한민국", "사우디", "쿠웨이트", "우즈베키스탄"};
		Stack<String> stack = new Stack<>();
		for (String n : groupA) {
			stack.push(n); // 스택에 데이터 추가
		}
		while(!stack.isEmpty()) {
			// isEmpty() : stack이 비어있는지 비교하여 비어있으면 true
			out.println(stack.pop());
		}
	}
}