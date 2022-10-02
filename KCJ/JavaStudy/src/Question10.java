import java.util.*;

public class Question10 {
	public static void main(String[] args) {
		
		System.out.println("--------------------------- 숫자 추측 게임 ---------------------------");
		System.out.println("1. 게임 시작");
		System.out.println("2. 게임 종료");
		
		Scanner sc = new Scanner(System.in);
		int game_start = 0, guess_number = 0, num = 0, count = 0;
		
		while(true) {
			try {
				game_start = sc.nextInt();
				break;
			} catch(InputMismatchException errorRes) {
				System.out.println(errorRes);
				System.out.println("숫자로 입력해주세요.");
				sc.nextLine();
			}
		}
		
		retry:
		do {
			if(game_start == 1) {
				Random rd = new Random();
				num = rd.nextInt(100)+1;
				
				do {
					System.out.print("정답을 추측하여 보시오.: ");
					while(true) {
						try{
							guess_number = sc.nextInt();
							break;
						}catch(InputMismatchException errorRes) {
							System.out.println(errorRes);
							System.out.println("숫자로 입력해주세요.");
							sc.nextLine();
						}
					}
					
					if(num < guess_number) {
						System.out.println("제시한 정수가 높습니다.");
					} else if(num > guess_number) {
						System.out.println("제시한 정수가 낮습니다.");
					}
					
					count++;
				}while(num != guess_number);
			} else {
				System.out.println("게임이 종료되었습니다.");
				break retry;
			}
			
			System.out.println("축하합니다.  시도횟수="+count);
			System.out.println("다시하시겠습니까?");
			System.out.println("1. 다시한다.");
			System.out.println("2. 게임을 종료한다.");
			game_start = sc.nextInt();
		} while(game_start == 2);
		
		sc.close();
	}
}