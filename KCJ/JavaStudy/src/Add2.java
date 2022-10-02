import java.util.*;

public class Add2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하시오: ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 숫자를 입력하시오: ");
		int num2 = sc.nextInt();
		
		System.out.println(num1 + num2);
		
		sc.close();
	}
}