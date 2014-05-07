package threadSafeSingleton.example4;

/**
 * In this approach, the synchronized block is used inside the if condition with
 * an additional check to ensure that only one instance of singleton class is
 * created.
 * 
 * @author rajeevprasanna
 * 
 */
public class ThreadSafeSingletonDoubleLocking {

	private static ThreadSafeSingletonDoubleLocking instance;

	private ThreadSafeSingletonDoubleLocking() {
	}

	public static ThreadSafeSingletonDoubleLocking getInstanceUsingDoubleLocking() {
		if (instance == null) {
			synchronized (ThreadSafeSingleton.class) {
				if (instance == null) {
					instance = new ThreadSafeSingletonDoubleLocking();
				}
			}
		}
		return instance;
	}
}
