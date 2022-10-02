import java.util.*;

public final class Lager {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수: ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수: ");
		int num2 = sc.nextInt();
		
//		if(num1 > num2) {
//			System.out.println("큰 수는 "+num1);
//		} else if(num2 > num1) {
//			System.out.println("큰 수는 "+num2);
//		}
		
		if(num1 < num2) {
			System.out.println("작은 수는 "+num1);
		} else if(num2 < num1) {
			System.out.println("작은 수는 "+num2);
		}
		
		sc.close();
	}
}