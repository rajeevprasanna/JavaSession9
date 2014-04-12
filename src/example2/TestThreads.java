package example2;

//https://gist.github.com/rajeevprasanna/10523611
public class TestThreads {
	public static void main(String[] args) {
		FooRunnable r = new FooRunnable();
		Thread t = new Thread(r);
		t.start();
	}
}