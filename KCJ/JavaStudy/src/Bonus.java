import java.util.*;

public class Bonus {
	public static void main(String[] args) {
		
		final int targetSales = 1000;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("실적을 입력하시오(단위: 만원): ");
		int per = sc.nextInt();
		
		if(per >= targetSales) {
			System.out.println("실적 달성");
			System.out.println("보너스: "+(per - targetSales)/10);
		}
		
		sc.close();
	}
}