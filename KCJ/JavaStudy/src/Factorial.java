import java.util.*;

public class Factorial {
	public static void main(String[] args) {
		
		long fac = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ�.: ");
		int n = sc.nextInt();
		
		for(int i=2; i<=n; i++) {
			fac = fac*i;
		}
		
		System.out.println(n+"!�� ����: "+fac);
		sc.close();
	}
}