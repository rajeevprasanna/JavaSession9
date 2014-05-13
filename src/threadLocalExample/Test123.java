package threadLocalExample;

import java.util.ArrayList;
import java.util.List;

public class Test123 {
 
	private ThreadLocal<List<Object>> threadLocalList = new ThreadLocal<List<Object>>() {
		@Override
		public List<Object> initialValue() {
			return new ArrayList<Object>();
		}
	};

	public static void main(String[] args) {
		final Test123 test123 = new Test123();

		class LocalRunnable implements Runnable {
			@Override
			public void run() {
				test123.startProcess();
			}
		}
		for (int i = 0; i < 100; i++) {
			Thread t = new Thread(new LocalRunnable());
			t.start();
		}
	}

	public void startProcess() {
		List<Object> list = threadLocalList.get();
		System.out.println("Before processed list => " + list.size());
		methodA();
		methodB();
		methodC();
		methodD();
		System.out.println("After processed list => " + list.size());
	}

	public void methodA() {
		List<Object> list = threadLocalList.get();
		list.add("a");
	}

	public void methodB() {
		List<Object> list = threadLocalList.get();
		list.add("b");
	}

	public void methodC() {
		List<Object> list = threadLocalList.get();
		list.add("c");
	}

	public void methodD() {
		List<Object> list = threadLocalList.get();
		list.add("d");
	}
}
