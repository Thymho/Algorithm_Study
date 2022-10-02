package secondRepeat;

import java.util.*;

public class TheaterReserve {
	public static void main(String[] args) {
		
		int num = 0;
		int[] seats = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("--------------------------------------");
			System.out.println("1   2   3   4   5   6   7   8   9   10");
			System.out.println("--------------------------------------");
			
			for(int i=0; i<seats.length; i++) {
				System.out.print(seats[i]+"   ");
			}
			
			System.out.print("\n원하시는 좌석번호를 입력하시오.(종료는 -1): ");
			num = sc.nextInt();
			
			if(num != -1) {
				try {
					++seats[num-1];
			
					for(int i=0; i<seats.length; i++) {
						if(seats[num-1] >= 2) {
							--seats[num-1];
							System.out.println("이미 예약된 자리입니다.");
						} else {
							System.out.println("예약이 완료되었습니다.");
						}
						break;
					}
				}catch(Exception e) {
					System.out.println("잘못된 숫자입니다.");
				}
			}
			
		}while(num != -1);
		System.out.println("극장 예약 시스템을 종료합니다.");
		sc.close();
	}
}