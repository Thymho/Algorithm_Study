import java.util.*;

public class CheckInput {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int month4 = 0;
		
		do {
			System.out.print("올바른 월을 입력하시오 [1-12]: ");
			month4 = sc.nextInt();
		} while(month4 < 1 || month4 > 12);
		
		System.out.println("사용자가 입력한 월은 "+month4);
		
		sc.close();
	}
}