import java.util.*;

public class SwitchCaseExample {
	public static void main(String[] args) {
		
		System.out.print("1. ����\n2. ���� \n3. ����\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �����ϼ���.: " );
		int num = sc.nextInt();
		
		switch(num) {
			case 1:
				System.out.println("������ �����ϼ̽��ϴ�.");
				break;
			case 2:
				System.out.println("������ �����ϼ̽��ϴ�.");
				break;
			case 3:
				System.out.println("������ �����ϼ̽��ϴ�.");
				break;
			default:
				System.out.println("�Է°��� �߸��Ǿ����ϴ�.");
		}
		
		sc.close();
		
	}
}
