import java.util.*;

public class Factorial {
	public static void main(String[] args) {
		
		long fac = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오.: ");
		int n = sc.nextInt();
		
		for(int i=2; i<=n; i++) {
			fac = fac*i;
		}
		
		System.out.println(n+"!의 값은: "+fac);
		sc.close();
	}
}