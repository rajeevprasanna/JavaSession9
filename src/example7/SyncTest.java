package example7;

//https://gist.github.com/rajeevprasanna/10526186
public class SyncTest {

	public void doStuff() throws InterruptedException {
		// System.out.println("entered doStuff method. name => " +
		// Thread.currentThread().getName());
		synchronized (this) { // this refers to SyncTest
			System.out.println("entered synchronized block. name => "
					+ Thread.currentThread().getName());
			Thread.sleep(3000);
			System.out.println("going to end synchronized block. name => "
					+ Thread.currentThread().getName());
		}
		// System.out.println("out of synchronized block. name => " +
		// Thread.currentThread().getName());
	}

	public void doStuffClassLock() throws InterruptedException {
		// System.out.println("entered doStuff method. name => " +
		// Thread.currentThread().getName());
		synchronized (SyncTest.class) { // this refers to SyncTest
			System.out.println("entered synchronized block. name => "
					+ Thread.currentThread().getName());
			// Thread.sleep(3000);
			System.out.println("going to end synchronized block. name => "
					+ Thread.currentThread().getName());
		}
		// System.out.println("out of synchronized block. name => " +
		// Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// final SyncTest s1 = new SyncTest();
		// class LocalRunnable implements Runnable {
		// @Override
		// public void run() {
		// try {
		// s1.doStuff();
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }
		// }
		// }
		//
		// Thread localThread1 = new Thread(new LocalRunnable());
		// Thread localThread2 = new Thread(new LocalRunnable());
		// Thread localThread3 = new Thread(new LocalRunnable());
		//
		// localThread1.setName("thread1");
		// localThread1.start();
		//
		// localThread2.setName("thread2");
		// localThread2.start();
		//
		// localThread3.setName("thread3");
		// localThread3.start();

		// class level locking example
		class LocalRunnable implements Runnable {
			@Override
			public void run() {
				try {
					SyncTest s = new SyncTest();
					s.doStuffClassLock();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		Thread localThread1 = new Thread(new LocalRunnable());
		Thread localThread2 = new Thread(new LocalRunnable());
		Thread localThread3 = new Thread(new LocalRunnable());

		localThread1.setName("thread1");
		localThread1.start();

		localThread2.setName("thread2");
		localThread2.start();

		localThread3.setName("thread3");
		localThread3.start();
	}

	public synchronized void doStuff1() {
		// t1
		System.out.println("synchronized");
		// line 2
		// line3
		// line4
	}

	public synchronized void doStuff12() {
		// t2
		System.out.println("synchronized");
		// line 2
		// line3
		// line4
	}

	// doStuff1 is equivalent to this:
	public void doStuff3() {
		synchronized (this) {
			System.out.println("synchronized");
			// line 2
			// line3
		}
		// line4
	}

	public static void getCount() {
		synchronized (SyncTest.class) {
			System.out.println("synchronized static method");
		}
	}

	public static void classMethod() throws ClassNotFoundException {
		Class cl = Class.forName("SyncTest");
		synchronized (cl) {
			// do stuff
		}
	}

}
