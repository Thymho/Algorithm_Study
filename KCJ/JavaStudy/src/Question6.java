import java.util.*;

public class Question6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ϼ��� �˰� ���� ���� �Է��Ͻÿ�: ");
		int month2 = sc.nextInt();
		
		switch(month2) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("���� ������ "+31);
				break;
			case 2:
				System.out.println("���� ������ "+28);
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("���� ������ "+30);
				break;
		}
		
		sc.close();
	}
}