package example3;

//https://gist.github.com/rajeevprasanna/10523611
public class NameRunnable implements Runnable {
	public void run() {
		long x = Thread.currentThread().getId();
//		 try {
//			Thread.sleep(20000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		 
		 System.out.println(x);
		
		//Invoked the static Thread.currentThread() method, which returns a reference to the currently executing thread, and 
		//then we invoked getName() on that returned reference
		System.out.println("Run by " + Thread.currentThread().getName());
		System.out.println("Run by " + Thread.currentThread().getId());
	}
}