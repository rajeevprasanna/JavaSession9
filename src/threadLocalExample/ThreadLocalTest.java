package threadLocalExample;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

//http://javarevisited.blogspot.in/2012/05/how-to-use-threadlocal-in-java-benefits.html
//Refer: http://java.dzone.com/articles/java-thread-local-%E2%80%93-how-use


//ThreadLocal provides another way to extend Thread. If you want to preserve or carry information from one method call to 
//another you can carry it by using ThreadLocal. This can provide immense flexibility as you don't need to modify any method.
public class ThreadLocalTest {

	public static void main(String args[]) throws IOException {
		Thread t1 = new Thread(new Task());
		Thread t2 = new Thread(new Task());

		t1.start();
		t2.start();
	}

	/*
	 * Thread safe format method because every thread will use its own
	 * DateFormat
	 */
	public static String threadSafeFormat(Date date) {
		DateFormat formatter = PerThreadFormatter.getDateFormatter();
		return formatter.format(date);
	}

}
