package JAVA;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class java_time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);

	}

}
