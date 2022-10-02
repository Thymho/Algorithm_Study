import java.util.Scanner;

public class Question7_repeat3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("두개의 정수를 입력하시오(큰수, 작은수): ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int rem = 0;
		
		while(true) {
			rem = num1%num2;
			num1 = num2;
			num2 = rem;
			
			if(num2 == 0) {
				break;
			}
		}
		sc.close();
		
		System.out.println("최대 공약수는 "+num1);
	}
}