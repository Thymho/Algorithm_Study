import java.util.*;

public final class Lager {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ����: ");
		int num1 = sc.nextInt();
		
		System.out.print("�ι�° ����: ");
		int num2 = sc.nextInt();
		
//		if(num1 > num2) {
//			System.out.println("ū ���� "+num1);
//		} else if(num2 > num1) {
//			System.out.println("ū ���� "+num2);
//		}
		
		if(num1 < num2) {
			System.out.println("���� ���� "+num1);
		} else if(num2 < num1) {
			System.out.println("���� ���� "+num2);
		}
		
		sc.close();
	}
}