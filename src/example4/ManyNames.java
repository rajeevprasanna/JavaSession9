package example4;

//https://gist.github.com/rajeevprasanna/10523858
public class ManyNames {

	public static void main(String[] args) {
		// Make one Runnable
		NameRunnable nr = new NameRunnable();
		//All three Thread instances get the same Runnable instance, and each thread is given a unique name.
		
		Thread one = new Thread(nr);
		Thread two = new Thread(nr);
		Thread three = new Thread(nr);
		
		one.setName("Fred");
		two.setName("Lucy");
		three.setName("Ricky");
		
		one.start();
		two.start();
		three.start();
		//Order of thread execution is not guaranteed.
	}
}
