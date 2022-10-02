import java.util.Scanner;

public class Question18 {
	public static void main(String[] args) {
	
		char[][] board = new char[3][3];
		int x,y;
		
		Scanner sc = new Scanner(System.in);
		
		//게임판 초기화
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				board[i][j] = ' ';
			}
		}
		
		do {
			//게임판 그리기
			for(int i=0; i<3; i++) {
				System.out.println("  "+board[i][0] + "|  "
						+ board[i][1] + "|  " + board[i][2]);
				
				if(i != 2) {
					System.out.println("---|---|---");
				}
			}
			
			System.out.print("다음 수의 좌표를 입력하시오: ");
			x = sc.nextInt();
			y = sc.nextInt();
			
			//사용자가 놓은 위치를 검사하는 로직
			if(board[x][y] != ' ') {
				System.out.println("잘못된 위치입니다.");
				continue;
			} else {
				board[x][y]='X';
			}
			
			//컴퓨터가 놓을 위치를 결정한다.
			int i=0, j=0;
			
			check:
			for(i=0; i<3; i++) {
				for(j=0; j<3; j++) {
					if(board[i][j] == ' ') {
						break check;
					}
				}
			}
			
			if(i<3 && j<3) {
				board[i][j] = 'O';
			}
			
			sc.close();
		}while(true);
	}
}