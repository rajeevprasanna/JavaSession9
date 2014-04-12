package example5;

//https://gist.github.com/rajeevprasanna/10524505
public class ManyNames {
	public static void main(String[] args) {
		// Make one Runnable
		NameRunnable nr = new NameRunnable();
		Thread one = new Thread(nr);
		one.setName("Fred");
		Thread two = new Thread(nr);
		two.setName("Lucy");
		Thread three = new Thread(nr);
		three.setName("Ricky");
		one.start();
		two.start();
		three.start();
		// Just keep in mind that the behavior in the preceding output is still
		// not guaranteed. You can't be certain how long a thread will actually
		// run before it gets put to sleep, so you can't know with certainty
		// that only one of the three threads will be in the runnable state when
		// the running thread goes to sleep. I
	}
}
