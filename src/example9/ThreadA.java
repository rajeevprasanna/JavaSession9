package example9;

public class ThreadA {

	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		b.start();
		b.setName("b");

		synchronized (b) {
			try {  
				System.out.println("Waiting for b to complete...");
				System.out.println("name in main method : "+ Thread.currentThread().getName());
				
				//Tells calling thread Main to wait.
				b.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			//If u don't put wait, main method may complete running process and print default value which is 0
			System.out.println("Total is: " + b.total);
		}
	}
}
