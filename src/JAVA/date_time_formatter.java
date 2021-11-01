package JAVA;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class date_time_formatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
//		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy ");
//		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E ");
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E a ");
		DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
		
		
		String myDate = dt.format(df);
		System.out.println(myDate);

	}

}
