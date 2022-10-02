import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Challenger3 {
	public static void main(String[] args) {
	
//		Date date = new Date();
//		int month = date.getMonth();
//		
//		System.out.println("현재 월은 "+date);
//		System.out.println(month);
//		
//		if(month >= 3 || month <= 5) {
//			System.out.println("핑크빛 봄이네요!");
//		} else if(month >= 6 || month <= 8) {
//			System.out.println("푸르른 여름이네요!");
//		} else if(month >=9 || month >= 10) {
//			System.out.println("청명한 가을이네요!");
//		} else {
//			System.out.println("하얀 겨울이네요!");
//		}
		
		Date date = new Date();
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		int month = localDate.getMonthValue();
		
		System.out.println("현재 월은: "+date);
		System.out.println(month);
		
		if(month >= 3 && month <= 5) {
			System.out.println("핑크빛 봄이네요!");
		} else if(month >= 6 && month <= 8) {
			System.out.println("푸르른 여름이네요!");
		} else if(month >9 && month >= 10) {
			System.out.println("청명한 가을이네요!");
		} else {
			System.out.println("하얀 겨울이네요!");
		}
	}
}