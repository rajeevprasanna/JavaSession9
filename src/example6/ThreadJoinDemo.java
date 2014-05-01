package example6;

//https://gist.github.com/rajeevprasanna/10525547
public class ThreadJoinDemo implements Runnable {

	public void run() {
		Thread t = Thread.currentThread();
		System.out.print(t.getName());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// checks if this thread is alive
		System.out.println(", status in thread block = " + t.isAlive());
	}

}