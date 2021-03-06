package threadLocalExample;

import java.util.ArrayList;
import java.util.List;

public class Test12 {

	private List<Object> list = new ArrayList<Object>();

	public static void main(String[] args) {
		final Test12 test12 = new Test12();

		class LocalRunnable implements Runnable {
			@Override
			public void run() {
				test12.startProcess();
			}
		}
		for (int i = 0; i < 100; i++) {
			Thread t = new Thread(new LocalRunnable());
			t.start();
		}
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
