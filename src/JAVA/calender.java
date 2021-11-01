package JAVA;

import java.util.Calendar;
import java.util.TimeZone;

public class calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getCalendarType());
		
		System.out.println(calendar.getTimeZone());
		System.out.println(calendar.getTime());
		
//		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
//		System.out.println(calendar.getCalendarType());
//		
//		System.out.println(calendar.getTimeZone().getID());
		
	}

	
}
