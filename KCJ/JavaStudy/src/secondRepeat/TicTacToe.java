package secondRepeat;

import java.util.*;

public class TicTacToe {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		String[][] gameMap = new String[3][3];
//		
//		int x = 0, y = 0, comX = 0, comY = 0, count = 0;
//		
//		//게임 시작하기 전에 맵 그리기
//		for(int i=0; i<gameMap.length; i++) {
//			for(int j=0; j<gameMap[i].length; j++) {
//				gameMap[i][j] = " ";
//				if(j < gameMap[i].length-1) {
//					System.out.print(" "+gameMap[i][j]+" |");
//				} else if(j <= gameMap[i].length) {
//					System.out.print(" "+gameMap[i][j]+" ");
//				}
//			}
//			if(i < gameMap.length-1) {
//				System.out.println("\n---|---|---");
//			}
//		}
//		
//		//게임 플레이
//		while(true) {
//			
//			System.out.print("\n다음 수의 좌포를 입력하시오: ");
//			x = sc.nextInt();
//			y = sc.nextInt();
//			
//			//컴퓨터 턴
//			gameMap[x][y] = "X";
//			
//			if(count == 0) {
//				gameMap[comX][comY] = "O";
//			} else {
//				if(comY == 2) {
//					comY = 0;
//				} else {
//					++comY;
//				}
//				gameMap[comX][comY] = "O";
//			}
//			
//			if(count != 0 && count%3 == 0) {
//				++comX;
//				gameMap[comX][comY] = "O";
//			}
//			
//			//유저가 설정한 문자를 출력하는 반복문
//			for(int i=0; i<gameMap.length; i++) {
//				for(int j=0; j<gameMap[i].length; j++) {
//					if(j < gameMap[i].length-1) {
//						System.out.print(" "+gameMap[i][j]+" |");
//					} else if(j <= gameMap[i].length) {
//						System.out.print(" "+gameMap[i][j]+" ");
//					}
//				}
//				if(i < gameMap.length-1) {
//					System.out.println("\n---|---|---");
//				}
//			}
//			
//			count++;
//			
//			if(count == 9) {
//				break;
//			}
//		}
//		
//		sc.close();
		
		char[][] board = new char[3][3];
		int x,y;
		
		Scanner sc = new Scanner(System.in);
		
		//게임판을 나타내는 2차원 배열 초기화
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				board[i][j]=' ';
			}
		}
		
		do {
			//개임판 그리기
			for(int i=0; i<3; i++) {
				System.out.println("  "+board[i][0]+"|  "
						+ board[i][1] + "| "+board[i][2]);
				if(i != 2) {
					System.out.println("---|---|---");
				}
			}
			
			System.out.print("다음 수의 좌표를 입력하시오: ");
			x = sc.nextInt();
			y = sc.nextInt();
			
			//사용자가 놓은 위치를 검사한다.
			if(board[x][y] != ' ') {
				System.out.println("잘못된 위치입니다. ");
				continue;
			} else {
				board[x][y]='X';
				
			}
			
			//컴퓨터가 놓을 위치를 결정한다.
			int i=0, j=0;
			
			com:
			for(i =0; i<3; i++) {
				for(j=0; j<3; j++) {
					if(board[i][j] == ' ') {
						break com;
					}
				}
			}
			
			if(i<3 && j<3) {
				board[i][j] = 'O';
			}
		}while(true);
	}
}