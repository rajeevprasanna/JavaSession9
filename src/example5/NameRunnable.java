package example5;

//https://gist.github.com/rajeevprasanna/10524505
class NameRunnable implements Runnable {
	public void run() {
		for (int x = 1; x < 4; x++) {
			System.out.println("Run by " + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ex) {
			}
		}
	}
}