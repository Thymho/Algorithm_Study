import java.util.*;

public class SwitchCaseExample3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����(1), ����(2), ��(3) �� �ϳ��� �Է��ϼ���.: ");
		int rsp_p1 = sc.nextInt();
		int rsp_com = (int)(Math.random()*3)+1;
		
		System.out.println("����� "+rsp_p1+"�Դϴ�.");
		System.out.println("��ǻ�ʹ� "+rsp_com+"�Դϴ�.");
		
		if(rsp_p1>0 && rsp_com<4) {
			switch(rsp_p1-rsp_com) {
				case 0:
					System.out.println("�����ϴ�.");
					break;
				case 1:
					System.out.println("����� �̰���ϴ�.");
					break;
				case 2:
					System.out.println("���� �̰���ϴ�.");
					break;
			}
		} else {
			System.out.println("�Է°��� �߸��Ǿ����ϴ�.");
		}
		
		sc.close();
	}
}