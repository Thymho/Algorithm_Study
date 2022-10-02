import java.util.Scanner;

public class Question17_repeat {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] seats = new int[10];
		int num = 0;
		
		while(true) {
			
			System.out.println("----------------------------------");
			System.out.println(" 1  2  3  4  5  6  7  8  9  10");
			System.out.println("----------------------------------");
			
			for(int i=0; i<seats.length; i++) {
				if(i==0) {
					System.out.print(" "+seats[i]);
				} else {
					System.out.print("  "+seats[i]);
				}
			}
			
			System.out.print("\n원하시는 좌석번호를 입력하세요(종료는 -1): ");
			num = sc.nextInt();
			
			if(num == -1) {
				System.out.println("극장 예약 시스템을 종료합니다.");
				break;
			}
			
			for(int i=0; i<seats.length; i++) {
				if(seats[num-1] == 1){
					System.out.println("이미 예약된 자리입니다.");
					break;
				}
				
				if(i+1 == num) {
					seats[i] = 1;
					System.out.println("예약 되었습니다.");
					break;
				}
			}
			
		}
		
		sc.close();
	}
}