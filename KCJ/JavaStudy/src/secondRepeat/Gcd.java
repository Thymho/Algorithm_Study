package secondRepeat;

import java.util.Scanner;

public class Gcd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ΰ��� ������ �Է��ϼ���.(ū��, ������): ");
		
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
		System.out.println("�ִ� ������� "+x);
	}
}