import java.util.*;

public class Challenger10 {
	public static void main(String[] args) {
		
		System.out.print("�迭 ����� �� ������ �Է��Ͻÿ�.: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		String[] strArray = new String[size];
		String answer = null;
		
		sc.nextLine();
		
		for(int i=0; i<strArray.length; i++) {
			System.out.print("�迭�ȿ� �� ���ڿ��� �Է��ϼ���.: ");
			strArray[i] = sc.nextLine();
		}
		
		for(int i=0; i<strArray.length; i++) {
			for(int j=1; j<strArray.length; j++) {
				if(strArray[i].length() > strArray[j].length()) {
					answer = strArray[i];
				}
			}
		}
		sc.close();
		
		System.out.println("\n���� ���̰� �� ���ڿ��� "+answer+" �Դϴ�.");
	}
}