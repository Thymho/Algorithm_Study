import java.util.*;

public class Question5 {
	public static void main(String[] args) {
		
		Date date = new Date();
		Calendar calendar = GregorianCalendar.getInstance();
		calendar.setTime(date);
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		
		System.out.println("����ð��� "+date);
		System.out.println(hour);
		
		
		if(hour < 11) {
			System.out.println("Good morning");
		} else if(hour < 15) {
			System.out.println("Good afternoon");
		} else if(hour < 20) {
			System.out.println("Good evening");
		} else {
			System.out.println("Good night");
		}
	}
}
