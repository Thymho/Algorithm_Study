import java.util.*;

public class Question9_repeat {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("난수의 개수: ");
		int count = sc.nextInt();
		
		Random rd = new Random();
		
		int number = 0, sum = 0;
		
		for(int i=0; i<count; i++) {
			number = rd.nextInt(100);
			sum += number;
		}
		
		sc.close();
		
		System.out.println("난수 "+count+"개의 합은 "+sum);
	}
}