import java.util.*;

public class SwitchCaseExample2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String capLet = sc.nextLine();
		
		char capLetChar = capLet.charAt(0);
		int charLength = capLet.length();
		
		if(charLength == 1) {
			switch(capLetChar) {
				case 'A':
					System.out.println("�Ǹ��մϴ�.");
					break;
				case 'B':
					System.out.println("�����ϴ�.");
					break;
				case 'C':
					System.out.println("�����Դϴ�.");
					break;
				case 'D':
					System.out.println("����ϼ���");
					break;
				default:
					System.out.println("�߸��Է��ϼ̽��ϴ�.");
					break;
			}
		} else {
			System.out.println("�ѱ��ڸ� �Է��ϼ���.");
		}
		
		sc.close();
	}
}