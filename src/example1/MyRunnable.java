package example1;

//https://gist.github.com/rajeevprasanna/10522963
class MyRunnable implements Runnable {
	public void run() {
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println(Thread.currentThread().getName());
	}
}
