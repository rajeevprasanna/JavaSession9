package example4;

//https://gist.github.com/rajeevprasanna/10523858
//Running multiple threads
public class NameRunnable implements Runnable {
	public void run() {
		for (int x = 1; x <= 3; x++) {
			System.out.println("Run by " + Thread.currentThread().getName()
					+ ", x is " + x);
		}
	}
}