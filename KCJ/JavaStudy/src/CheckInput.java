import java.util.*;

public class CheckInput {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int month4 = 0;
		
		do {
			System.out.print("�ùٸ� ���� �Է��Ͻÿ� [1-12]: ");
			month4 = sc.nextInt();
		} while(month4 < 1 || month4 > 12);
		
		System.out.println("����ڰ� �Է��� ���� "+month4);
		
		sc.close();
	}
}