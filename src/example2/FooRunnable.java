package example2;

//https://gist.github.com/rajeevprasanna/10523611
public class FooRunnable implements Runnable {
	public void run() {
		for (int x = 1; x < 6; x++) {
			System.out.println("Runnable running => "+ x);
		}
	}
}
