import java.util.Scanner;

public class Question23 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str;
		
		while(true) {
			System.out.print("���ڿ��� �Է��ϼ���> ");
			str = sc.next();
			
			if(str.equals("quit") == true) {
				break;
			}
			
			if(str.matches("^www\\.().+") == true) {
				System.out.println(str+"�� "+"'www'"+"�� �����մϴ�.");
			} else {
				System.out.println(str+"�� "+"'www'"+"�� �������� �ʽ��ϴ�.");
			}
		}
		
		sc.close();
	}
}