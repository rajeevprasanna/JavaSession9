package example3;

//https://gist.github.com/rajeevprasanna/10523611
public class NameRunnable implements Runnable {
	public void run() {
		System.out.println("NameRunnable running");
		
		//Invoked the static Thread.currentThread() method, which returns a reference to the currently executing thread, and 
		//then we invoked getName() on that returned reference
		System.out.println("Run by " + Thread.currentThread().getName());
	}
}