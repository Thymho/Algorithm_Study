import java.util.*;

public class Question10 {
	public static void main(String[] args) {
		
		System.out.println("--------------------------- ���� ���� ���� ---------------------------");
		System.out.println("1. ���� ����");
		System.out.println("2. ���� ����");
		
		Scanner sc = new Scanner(System.in);
		int game_start = 0, guess_number = 0, num = 0, count = 0;
		
		while(true) {
			try {
				game_start = sc.nextInt();
				break;
			} catch(InputMismatchException errorRes) {
				System.out.println(errorRes);
				System.out.println("���ڷ� �Է����ּ���.");
				sc.nextLine();
			}
		}
		
		retry:
		do {
			if(game_start == 1) {
				Random rd = new Random();
				num = rd.nextInt(100)+1;
				
				do {
					System.out.print("������ �����Ͽ� ���ÿ�.: ");
					while(true) {
						try{
							guess_number = sc.nextInt();
							break;
						}catch(InputMismatchException errorRes) {
							System.out.println(errorRes);
							System.out.println("���ڷ� �Է����ּ���.");
							sc.nextLine();
						}
					}
					
					if(num < guess_number) {
						System.out.println("������ ������ �����ϴ�.");
					} else if(num > guess_number) {
						System.out.println("������ ������ �����ϴ�.");
					}
					
					count++;
				}while(num != guess_number);
			} else {
				System.out.println("������ ����Ǿ����ϴ�.");
				break retry;
			}
			
			System.out.println("�����մϴ�.  �õ�Ƚ��="+count);
			System.out.println("�ٽ��Ͻðڽ��ϱ�?");
			System.out.println("1. �ٽ��Ѵ�.");
			System.out.println("2. ������ �����Ѵ�.");
			game_start = sc.nextInt();
		} while(game_start == 2);
		
		sc.close();
	}
}