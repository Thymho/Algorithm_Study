import java.util.*;

public class EvenOdd {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ�: ");
		int num = sc.nextInt();
		
		if(num%2 == 0) {
			System.out.println("�Էµ� ������ ¦���Դϴ�.");
		} else {
			System.out.println("�Էµ� ������ Ȧ���Դϴ�.");
		}
		
		sc.close();
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}
}