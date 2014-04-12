package example6;

//https://gist.github.com/rajeevprasanna/10525547
public class ThreadJoinDemo implements Runnable {

	public void run() {

		Thread t = Thread.currentThread();
		System.out.print(t.getName());
		// checks if this thread is alive
		System.out.println(", status = " + t.isAlive());
	}

	public static void main(String args[]) throws Exception {

		Thread t = new Thread(new ThreadJoinDemo());
		// this will call run() function
		t.start();
		// waits for this thread to die
		
		//run again by commenting below join code
		t.join();
		System.out.print(t.getName());
		// checks if this thread is alive
		System.out.println(", status = " + t.isAlive());
	}
}