import java.util.Scanner;

public class Question17 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] seats = new int[10];
		int num = 0;
		
		do {
			System.out.println("------------------------------------------------");
			System.out.println(" 1    2    3    4    5    6    7    8    9    10");
			System.out.println("------------------------------------------------");
			
			for (int i = 0; i < seats.length; i++) {
				System.out.print(" "+seats[i]+"   ");
			}
			
			System.out.print("\n���Ͻô� �¼���ȣ�� �Է��ϼ���(����� -1): ");
			num = sc.nextInt();
			
			if(seats[num-1] == 0) {
				seats[num-1] = 1;
				System.out.println("����Ǿ����ϴ�.");
			} else {
				System.out.println("�̹� ����� �ڸ��Դϴ�.");
			}
			
		} while(num != -1);
		
		System.out.println("����Ǿ����ϴ�.");
		
		sc.close();
	}
}
