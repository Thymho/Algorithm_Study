package secondRepeat;

import java.util.*;

public class RandomNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.print("난수의 개수: ");
		
		int number, sum = 0;
		int count = sc.nextInt();
		
		for(int i=0; i<count; i++) {
			number = rd.nextInt(100);
			sum += number;
		}
		
		sc.close();
		
		System.out.println("난수 "+count+"개의 합은 "+sum);
	}
}