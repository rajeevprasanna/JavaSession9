package threadLocalExample;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {	
		final Test1 test1 = new Test1();
		 
		class LocalRunnable implements Runnable {
			@Override
			public void run() {
				test1.startProcess();
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
		  methodA(list);
		  methodB(list);
		  methodC(list);
		  methodD(list);
		System.out.println("After processed list => " + list.size()+ " "+list.hashCode());
	}

	public void methodA(List<Object> list) {
		list.add("a");		 
	}

	public void methodB(List<Object> list) {
		list.add("b");		 
	}

	public void methodC(List<Object> list) {
		list.add("c");		 
	}

	public void methodD(List<Object> list) {
		list.add("d");		 
	}
}
