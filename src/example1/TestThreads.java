package example1;

//https://gist.github.com/rajeevprasanna/10522963
public class TestThreads {
	public static void main(String[] args) {
		MyRunnable runnable = new MyRunnable();
//		Thread t1 = new Thread(r);
//		Thread t2 = new Thread(r);
//		Thread t3 = new Thread(r);
//		Thread t4 = new Thread(new Runnable() {			
//			@Override
//			public void run() {
//				System.out.println("This is anonymous class");				
//			}
//		});
		
		for(int i=1;i<=10; i++){
			Thread t = new Thread(runnable);
			t.setName("Thread Name => "+ i);			 				 
			t.setPriority(i);
			t.start();
//			System.out.println(t.MAX_PRIORITY);
//			System.out.println(t.MIN_PRIORITY);
 		}
		
		
		
//		t1.start();
//		t2.start();
//		t3.start();
//		t4.start();
	}
}