import java.util.*;

public class Question8 {
	public static void main(String[] args) {
		
		int num, answer = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("���� ������ �Է��Ͻÿ�.: ");
			num = sc.nextInt();
		} while(num<0);
		
		System.out.println(num+"�� ����� ������ �����ϴ�.");
		for(int i=1; i<=num; i++) {
			if(num%i == 0) {
				answer = i;
				System.out.print(answer+" ");
			}
		}
		
		sc.close();
	}
}