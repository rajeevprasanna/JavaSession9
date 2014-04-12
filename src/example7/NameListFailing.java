package example7;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//https://gist.github.com/rajeevprasanna/10526186
public class NameListFailing {
	
	private List names = Collections.synchronizedList(new LinkedList());

	public void add(String name) {
		names.add(name);
	}

	//This code can break if we run the program multiple times
	//Even collection.syncronize also can fail when dealing with multiple threads if we don't code properly.
	//There's a solution here: don't rely on Collections.synchronizedList(). Instead, synchronize the code yourself:
	public String removeFirst() {
		if (names.size() > 0)
			return (String) names.remove(0);
		else
			return null;
	}

	public static void main(String[] args) {
		final NameListFailing nl = new NameListFailing();
		nl.add("Ozymandias");
		class NameDropper extends Thread {
			public void run() {
				String name = nl.removeFirst();
				System.out.println(name);
			}
		}
		Thread t1 = new NameDropper();
		Thread t2 = new NameDropper();
		t1.start();
		t2.start();
	}
}
