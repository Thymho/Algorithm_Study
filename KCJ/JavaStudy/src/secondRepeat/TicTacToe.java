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
//		//���� �����ϱ� ���� �� �׸���
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
//		//���� �÷���
//		while(true) {
//			
//			System.out.print("\n���� ���� ������ �Է��Ͻÿ�: ");
//			x = sc.nextInt();
//			y = sc.nextInt();
//			
//			//��ǻ�� ��
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
//			//������ ������ ���ڸ� ����ϴ� �ݺ���
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
		
		//�������� ��Ÿ���� 2���� �迭 �ʱ�ȭ
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				board[i][j]=' ';
			}
		}
		
		do {
			//������ �׸���
			for(int i=0; i<3; i++) {
				System.out.println("  "+board[i][0]+"|  "
						+ board[i][1] + "| "+board[i][2]);
				if(i != 2) {
					System.out.println("---|---|---");
				}
			}
			
			System.out.print("���� ���� ��ǥ�� �Է��Ͻÿ�: ");
			x = sc.nextInt();
			y = sc.nextInt();
			
			//����ڰ� ���� ��ġ�� �˻��Ѵ�.
			if(board[x][y] != ' ') {
				System.out.println("�߸��� ��ġ�Դϴ�. ");
				continue;
			} else {
				board[x][y]='X';
				
			}
			
			//��ǻ�Ͱ� ���� ��ġ�� �����Ѵ�.
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