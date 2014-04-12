package example1;

//https://gist.github.com/rajeevprasanna/10522963
public class MyThread {

	public void run() {
		System.out.println("Important job running in MyThread");
	}

	// you're free to overload the run()method in your Thread subclass
	
	// The overloaded run(String s) method will be ignored by the Thread class
	// unless you call it yourself. The Thread class expects a run() method with
	// no arguments, and it will execute this method for you in a separate call
	// stack after the thread has been started
	public void run(String s) {
		System.out.println("String in run is " + s);
	}
}
