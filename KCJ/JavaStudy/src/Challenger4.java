import java.time.LocalDate;
import java.util.*;

public class Challenger4 {
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		int year = date.getYear();
		System.out.println(year);
		
		int days = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ϼ��� �˰���� ������ �Է��ϼ���.: ");
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
				System.out.println(month3+"���� ������: "+days);
				break;
			case 2:
				if(year%4 == 0 && year%100 > 0 && year%400 > 0) {
					days = 29;
					System.out.println("2���� ������: "+days);
				} else {
					days = 28;
					System.out.println("2���� ������: "+days);
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days = 30;
				System.out.println(month3+"���� ������: "+days);
				break;
		}
		
		sc.close();
	}
}