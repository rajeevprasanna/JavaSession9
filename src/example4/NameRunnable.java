package example4;

//https://gist.github.com/rajeevprasanna/10523858
//Running multiple threads
public class NameRunnable implements Runnable {
	int x = 0;
	public void run() {
//		for ( int x = 1; x <= 10; x++) {
//			System.out.println("Run by " + Thread.currentThread().getName() + ", x is " + x);
//		}
		
		// t1
		//t2
		//t3
		for (x = 1; x <= 10; x++) {
			// t1 => 1,2,6
			//t2=> 1,4,8,9,10
			//t3=> 1,3,5,7
			 
			System.out.println("Run by " + Thread.currentThread().getName() + ", x is " + x);
		}

	}
}