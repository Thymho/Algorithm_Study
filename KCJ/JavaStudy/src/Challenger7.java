import java.util.*;

public class Challenger7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�л��� �� ������ �Է��Ͻÿ�.: ");
		int student = sc.nextInt();
		
		int[] grade = new int[student];
		int sum = 0;
		
		for(int i=0; i<=grade.length-1; i++) {
			
			do {
				System.out.print("������ �Է��Ͻÿ�.: ");
				
				try {
					grade[i] = sc.nextInt();
				} catch(InputMismatchException err) {
					System.out.println(err);
					System.out.println("���ڸ� �Է����ּ���.");
					sc = new Scanner(System.in);
				}
				
				if(grade[i] <= 100) {
					sum += grade[i];
				} else {
					System.out.println("�߸��� �����Դϴ�.");
				}
				
			}while(grade[i]>100);
			
		}
		
		System.out.println("��� ������ "+sum/student+"�Դϴ�.");
		sc.close();
	}
}