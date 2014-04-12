package example7;

//https://gist.github.com/rajeevprasanna/10526186
public class SyncTest {
	
	public void doStuff() {
		System.out.println("not synchronized");
		synchronized (this) {
			System.out.println("synchronized");
		}
	}

	public synchronized void doStuff1() {
		System.out.println("synchronized");
	}

	//  doStuff1 is equivalent to this:
	public void doStuff3() {
		synchronized (this) {
			System.out.println("synchronized");
		}
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
