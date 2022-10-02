import java.util.Scanner;

public class Question18 {
	public static void main(String[] args) {
	
		char[][] board = new char[3][3];
		int x,y;
		
		Scanner sc = new Scanner(System.in);
		
		//������ �ʱ�ȭ
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				board[i][j] = ' ';
			}
		}
		
		do {
			//������ �׸���
			for(int i=0; i<3; i++) {
				System.out.println("  "+board[i][0] + "|  "
						+ board[i][1] + "|  " + board[i][2]);
				
				if(i != 2) {
					System.out.println("---|---|---");
				}
			}
			
			System.out.print("���� ���� ��ǥ�� �Է��Ͻÿ�: ");
			x = sc.nextInt();
			y = sc.nextInt();
			
			//����ڰ� ���� ��ġ�� �˻��ϴ� ����
			if(board[x][y] != ' ') {
				System.out.println("�߸��� ��ġ�Դϴ�.");
				continue;
			} else {
				board[x][y]='X';
			}
			
			//��ǻ�Ͱ� ���� ��ġ�� �����Ѵ�.
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