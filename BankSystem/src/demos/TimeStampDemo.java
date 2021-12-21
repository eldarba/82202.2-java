package demos;

import java.time.LocalDateTime;
import java.util.Date;

public class TimeStampDemo {

	public static void main(String[] args) {
		long ts1 = 0;
		long ts2 = System.currentTimeMillis();
		System.out.println(ts2);
		
		Date date = new Date(ts2 + (1000*60*60*24));
		System.out.println(date);
		
		LocalDateTime dateTime = LocalDateTime.of(1980, 5, 25, 10, 30);
		System.out.println(dateTime);

	}

}
