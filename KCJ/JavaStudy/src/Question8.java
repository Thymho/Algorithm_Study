import java.util.*;

public class Question8 {
	public static void main(String[] args) {
		
		int num, answer = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("양의 정수를 입력하시오.: ");
			num = sc.nextInt();
		} while(num<0);
		
		System.out.println(num+"의 약수는 다음과 같습니다.");
		for(int i=1; i<=num; i++) {
			if(num%i == 0) {
				answer = i;
				System.out.print(answer+" ");
			}
		}
		
		sc.close();
	}
}