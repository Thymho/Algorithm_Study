import java.util.*;

public class Question7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int rem = 0;
		
		System.out.print("두개의 정수를 입력하시오(작은수, 큰수): ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while(rem <= 0) {
			rem = y%x;
			y=x;
			x=rem;
		}
		
		System.out.println("최대 공약수는: "+rem);
		
		sc.close();
	}
}