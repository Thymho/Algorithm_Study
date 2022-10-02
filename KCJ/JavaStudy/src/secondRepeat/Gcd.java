package secondRepeat;

import java.util.Scanner;

public class Gcd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두개의 정수를 입력하세요.(큰수, 작은수): ");
		
		int rem = 0;
		int x = sc.nextInt();
		int y = sc.nextInt();
		
//		while(x>y) {
//			rem = x%y;
//			x = rem;
//			y = x;
//		}
		
		while(y != 0) {
			rem = x%y;
			x = y;
			y = rem;
		}
		
		sc.close();
		System.out.println("최대 공약수는 "+x);
	}
}