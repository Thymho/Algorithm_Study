import java.util.*;

public class Question6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("일수를 알고 싶은 월을 입력하시오: ");
		int month2 = sc.nextInt();
		
		switch(month2) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("월의 날수는 "+31);
				break;
			case 2:
				System.out.println("월의 날수는 "+28);
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("월의 날수는 "+30);
				break;
		}
		
		sc.close();
	}
}