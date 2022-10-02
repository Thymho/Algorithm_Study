import java.time.LocalDate;
import java.util.*;

public class Challenger4 {
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		int year = date.getYear();
		System.out.println(year);
		
		int days = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("일수를 알고싶은 월수를 입력하세요.: ");
		int month3 = sc.nextInt();
		
		switch(month3) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days = 31;
				System.out.println(month3+"월의 날수는: "+days);
				break;
			case 2:
				if(year%4 == 0 && year%100 > 0 && year%400 > 0) {
					days = 29;
					System.out.println("2월의 날수는: "+days);
				} else {
					days = 28;
					System.out.println("2월의 날수는: "+days);
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days = 30;
				System.out.println(month3+"월의 날수는: "+days);
				break;
		}
		
		sc.close();
	}
}