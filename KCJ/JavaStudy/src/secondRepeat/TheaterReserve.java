package secondRepeat;

import java.util.*;

public class TheaterReserve {
	public static void main(String[] args) {
		
		int num = 0;
		int[] seats = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("--------------------------------------");
			System.out.println("1   2   3   4   5   6   7   8   9   10");
			System.out.println("--------------------------------------");
			
			for(int i=0; i<seats.length; i++) {
				System.out.print(seats[i]+"   ");
			}
			
			System.out.print("\n���Ͻô� �¼���ȣ�� �Է��Ͻÿ�.(����� -1): ");
			num = sc.nextInt();
			
			if(num != -1) {
				try {
					++seats[num-1];
			
					for(int i=0; i<seats.length; i++) {
						if(seats[num-1] >= 2) {
							--seats[num-1];
							System.out.println("�̹� ����� �ڸ��Դϴ�.");
						} else {
							System.out.println("������ �Ϸ�Ǿ����ϴ�.");
						}
						break;
					}
				}catch(Exception e) {
					System.out.println("�߸��� �����Դϴ�.");
				}
			}
			
		}while(num != -1);
		System.out.println("���� ���� �ý����� �����մϴ�.");
		sc.close();
	}
}