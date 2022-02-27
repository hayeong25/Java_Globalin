package Day1111;

import java.util.*;

class MyVector extends Vector<Object> {
	public MyVector() {
		super(1, 1); // 1개의 초기값, 모자라면 1개씩 증가
	}
	public void addInt(int i) {
		addElement(new Integer(i));
	}
	public void addFloat(float f) {
		addElement(new Float(f));
	}
	public void addString(String s) {
		addElement(s);
	}
	public void addCharArray(char[] a) {
		addElement(a);
	}
	public void write() {
		Object o;
		int length = size();
		System.out.println("벡터 요소의 길이 : " + length);
		for (int i = 0; i < length; i++) {
			o = elementAt(i);
			if(o instanceof char[]) {
				System.out.println(String.copyValueOf((char[]) o ));
			}
			else {
				System.out.println(o.toString());
			}
		}
	}
}

public class VectorEx2 {
	public static void main(String[] args) {
		MyVector v = new MyVector();
		int digit = 5;
		float real = 3.14f;
		char letters[] = {'a', 'b', 'c', 'd'};
		String s = new String("Who are you");
		v.addInt(digit);
		v.addFloat(real);
		v.addString(s);
		v.addCharArray(letters);
		v.write();
	}
}