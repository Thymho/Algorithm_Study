import java.util.*;

public class Challenger5 {
	public static void main(String[] args) {
		
		int rem = 0, mul = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("두개의 정수를 입력하시오(큰수, 작은수): ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int x = num1;
		int y = num2;
		
		while(rem <= 0) {
			rem = num1 % num2;
			num1 = num2;
			num2 = rem;
		}
		
		mul = x*y/rem;
		
		System.out.println("최대 공약수는 "+rem);
		System.out.println("최소 공배수는 "+mul);
		
		sc.close();
	}
}
