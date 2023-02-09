package Problems;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;
import java.util.TimeZone;

public class NewYorkTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Day of the week 
		LocalDate localDate = LocalDate.of(2001, 3, 13);
		DayOfWeek dayOfWeek = localDate.getDayOfWeek();
		System.out.println("Day of Week: " + dayOfWeek);
		
//		Time in New York
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("hh:mm:ss a");
		df.setTimeZone(TimeZone.getTimeZone("America/New_York"));
		System.out.println("Time in New York: "+ df.format(date));
		
//		Date Formatter
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
		String strDate = formatter.format(date);
		System.out.println(strDate);

	}

}
