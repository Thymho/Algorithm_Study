import java.util.*;

public class Question7_repeat2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1, num2, rem = 0;
		
		do {
			System.out.print("�� ���� �Է��Ͻÿ�.(������, ū��): ");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
		}while(num1>num2 || num1<0 || num2<0);
		
		while(num1 != 0) {
			rem = num2%num1;
			num2 = num1;
			num1 = rem;
		}
		
		System.out.println("�� ���� �ִ� ������� "+num2);
		
		sc.close();
	}
}