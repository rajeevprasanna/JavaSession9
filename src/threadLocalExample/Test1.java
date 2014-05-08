package threadLocalExample;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {		  
		final Test1 test123 = new Test1();

		class LocalRunnable implements Runnable {
			@Override
			public void run() {
				test123.startProcess();
			}
		}
		for (int i = 0; i < 2; i++) {
			Thread t = new Thread(new LocalRunnable());
			t.start();
		}
	}

	public void startProcess() {
		List<Object> list = new ArrayList<Object>();
		System.out.println("Before processed list => " + list.size()+ " "+list.hashCode());
		list = methodA(list);
		list = methodB(list);
		list = methodC(list);
		list = methodD(list);
		System.out.println("After processed list => " + list.size()+ " "+list.hashCode());
	}

	public List<Object> methodA(List<Object> list) {
		list.add("a");
		return list;
	}

	public List<Object> methodB(List<Object> list) {
		list.add("b");
		return list;
	}

	public List<Object> methodC(List<Object> list) {
		list.add("c");
		return list;
	}

	public List<Object> methodD(List<Object> list) {
		list.add("d");
		return list;
	}
}
