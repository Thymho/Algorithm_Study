import java.util.*;

public class Question7_repeat {
	public static void main(String[] args) {
		
		int rem, num1, num2 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("두 수를 입력하세요.(큰수, 작은수): ");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
		}while(num1<num2);
		
		while(num2 != 0) {
			rem = num1%num2;
			num1 = num2;
			num2 = rem;
		}
		
		System.out.println("최대공약수는 "+num1);
		
		sc.close();
	}
}