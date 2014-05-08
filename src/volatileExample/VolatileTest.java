package volatileExample;

/**
 * 
 * So what happens? Each thread has its own stack, and so its own copy of variables it can access. When the thread is created, 
 * it copies the value of all accessible variables in its own memory. The volatile keyword is used to say to the jvm "Warning, 
 * this variable may be modified in an other Thread". Without this keyword the JVM is free to make some optimizations, 
 * like never refreshing those local copies in some threads. The volatile force the thread to update the original variable for each variable. 
 * 
 * The volatile keyword could be used on every kind of variable, either primitive or objects!  
 * 
 * Refer : http://java.dzone.com/articles/java-volatile-keyword-0
 * 
 */
public class VolatileTest {

	// private static final Logger LOGGER = MyLoggerFactory.getSimplestLogger();

	private static volatile int MY_INT = 0;
	private  volatile Integer testInteger = 0;
	//private static volatile obj = new obje();
	//private volatile obj = new obje(); 
	
	//VolatileTest v1 = new VolatileTest();//t1,t2
	//VolatileTest v2 = new VolatileTest();//t3, t4
	
	private volatile VolatileTest test;

	public static void main(String[] args) {
		new ChangeListener().start();
		new ChangeMaker().start();
	}

	static class ChangeListener extends Thread {
		@Override
		public void run() {
			int local_value = MY_INT;
			while (local_value < 5) {
				if (local_value != MY_INT) {
					// LOGGER.log(Level.INFO,"Got Change for MY_INT : {0}",
					// MY_INT);
					local_value = MY_INT;
				}
			}
		}
	}

	static class ChangeMaker extends Thread {
		@Override
		public void run() {

			int local_value = MY_INT;
			while (MY_INT < 5) {
				// LOGGER.log(Level.INFO, "Incrementing MY_INT to {0}",
				// local_value+1);
				MY_INT = ++local_value;
				
				//obj.count = ++ local_value
				//obj.name = thread.currentRunning threadname
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
