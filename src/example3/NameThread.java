package example3;

//https://gist.github.com/rajeevprasanna/10523611
public class NameThread {
	public static void main(String[] args) {
		NameRunnable nr = new NameRunnable();
		Thread t = new Thread(nr);
		
		//Even if you don't explicitly name a thread, it still has a name.
		//Run this class be commenting below setName call
		t.setName("Fred");
		t.start();
		
		
		
		Thread t1 = new Thread(nr);		
//		t1.setName("Fred");
		t1.start();
		
		System.out.println("threads ended");
	}
}