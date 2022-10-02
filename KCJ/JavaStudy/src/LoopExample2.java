import java.util.Scanner;

public class LoopExample2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("구구단 중에서 출력하고 싶은 단을 입력하시오.: ");
			int num = sc.nextInt(), i = 0;
			
			if(num > 0) {
				while(i < 10) {
					System.out.println(num+"*"+i+ " = "+num*i);
					i++;
				}
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		
		sc.close();
	}
}