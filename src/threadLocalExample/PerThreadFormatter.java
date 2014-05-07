package threadLocalExample;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * One of the classic example of ThreadLocal is sharing SimpleDateForamt. Since
 * SimpleDateFormat is not thread safe, having a global formatter may not work
 * but having per Thread formatter will certainly work.
 * 
 * Read more:
 * http://javarevisited.blogspot.com/2012/05/how-to-use-threadlocal-in
 * -java-benefits.html#ixzz312vBETkv
 * 
 * @author rajeevprasanna
 * 
 */
public class PerThreadFormatter {

	private static final ThreadLocal<SimpleDateFormat> dateFormatHolder = new ThreadLocal<SimpleDateFormat>() {

		/*
		 * initialValue() is called
		 */
		@Override
		protected SimpleDateFormat initialValue() {
			System.out.println("Creating SimpleDateFormat for Thread : "
					+ Thread.currentThread().getName());
			return new SimpleDateFormat("dd/MM/yyyy");
		}
	};

	/*
	 * Every time there is a call for DateFormat, ThreadLocal will return
	 * calling Thread's copy of SimpleDateFormat
	 */
	public static DateFormat getDateFormatter() {
		return dateFormatHolder.get();
	}

}
