import java.util.*;

public class Question12 {
	public static void main(String[] args) {
		
		int[] grade = new int[5];
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			System.out.print("������ �Է��Ͻÿ�: ");
			grade[i] = sc.nextInt();
			sum += grade[i];
		}
		
		System.out.println("��� ������ "+sum/5+"�Դϴ�");
		
		sc.close();
	}
}