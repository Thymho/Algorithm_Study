import java.util.*;

public class LoopExample3_Challenger {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ�.: ");
		int num = sc.nextInt(), i = 0, sum = 0;
		
		while(i<=num) {
			sum += i;
			i++;
		}
		
		System.out.println("�հ�="+sum);
		
		sc.close();
	}
}
