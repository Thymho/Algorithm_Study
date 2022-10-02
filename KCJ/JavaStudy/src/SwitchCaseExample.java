import java.util.*;

public class SwitchCaseExample {
	public static void main(String[] args) {
		
		System.out.print("1. 삽입\n2. 수정 \n3. 삭제\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 선택하세요.: " );
		int num = sc.nextInt();
		
		switch(num) {
			case 1:
				System.out.println("삽입을 선택하셨습니다.");
				break;
			case 2:
				System.out.println("수정을 선택하셨습니다.");
				break;
			case 3:
				System.out.println("삭제를 선택하셨습니다.");
				break;
			default:
				System.out.println("입력값이 잘못되었습니다.");
		}
		
		sc.close();
		
	}
}
