import java.util.*;

public class Question9 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("난수의 개수: ");
		int count = sc.nextInt();
		
		Random rd = new Random();
		
		for(int i=0; i<=count; i++) {
			int number = rd.nextInt(100);
			sum += number;
		}
		
		System.out.println("난수 "+count+"개의 합은 "+sum);
		
		sc.close();
	}
}