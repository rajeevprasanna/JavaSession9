package threadLocalExample;

import java.util.ArrayList;
import java.util.List;

public class Test12 {

	private List<Object> list = new ArrayList<Object>();

	public static void main(String[] args) {
		Test123 t = new Test123();
		t.startProcess();
	}

	public void startProcess() {
		System.out.println("Before processed list => " + list.size());
		methodA();
		methodB();
		methodC();
		methodD();
		System.out.println("After processed list => " + list.size());
	}

	public void methodA() {
		list.add("a");
	}

	public void methodB() {
		list.add("b");
	}

	public void methodC() {
		list.add("c");
	}

	public void methodD() {
		list.add("d");
	}
}
