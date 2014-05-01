package example1;

//https://gist.github.com/rajeevprasanna/10522963
public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println("Important job running in MyThread");		 
		run("test");
	}

	// you're free to overload the run()method in your Thread subclass
	// The overloaded run(String s) method will be ignored by the Thread class
	// unless you call it yourself. The Thread class expects a run() method with
	// no arguments, and it will execute this method for you in a separate call
	// stack after the thread has been started
	//for(t -> 1 to 20){
	//t.start();
	//}
	
	public void run(String s) {
		System.out.println("String in run is " + s + " by thread name");//t1 t2 t3
		System.out.println("String in run is " + s + " by thread name");//t1
		System.out.println("String in run is " + s + " by thread name");//t1
		System.out.println("String in run is " + s + " by thread name");
		System.out.println("String in run is " + s + " by thread name");
		//t1, t2, t3
		//t1.start()do for t2 and t3
		//t1, t2, t3
		//t1 t3 t2
		//t2 t1 t3
	}
	
	public static void main(String[] args){
		MyThread t1 = new MyThread();
		t1.start();		
//		t1.run();
		
		
		MyThread t2 = new MyThread();
		t2.start();
//				
//		MyThread t3 = new MyThread();
//		t3.start();
	}
}
