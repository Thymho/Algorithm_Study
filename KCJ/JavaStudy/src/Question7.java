import java.util.*;

public class Question7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int rem = 0;
		
		System.out.print("�ΰ��� ������ �Է��Ͻÿ�(������, ū��): ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while(rem <= 0) {
			rem = y%x;
			y=x;
			x=rem;
		}
		
		System.out.println("�ִ� �������: "+rem);
		
		sc.close();
	}
}