import java.util.*;

public class Bonus {
	public static void main(String[] args) {
		
		final int targetSales = 1000;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ�(����: ����): ");
		int per = sc.nextInt();
		
		if(per >= targetSales) {
			System.out.println("���� �޼�");
			System.out.println("���ʽ�: "+(per - targetSales)/10);
		}
		
		sc.close();
	}
}