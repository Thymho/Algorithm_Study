package secondRepeat;

public class MineSweeper {
	public static void main(String[] args) {
//		boolean[][] map = new boolean[10][10];
//		
		//���� �� ����ϱ�
//		for(int i=0; i<map.length; i++) {
//			for(int j=0; j<map[i].length; j++) {
		
				//1~10������ ������ �߻���Ŵ.
//				int number = (int)(Math.random()*10)+1;
//				
				//30%�� Ȯ���� ���ڸ� ���� ���̱� ������ ������ 1~3�̸� true�� �ٲ��ش�.
//				if(number < 4) {
//					map[i][j] = true;
//				} else {
//					map[i][j] = false;
//				}
//				
				//�̶� true�� #���� ���ڰ� �ִٴ� ���� �˷��ش�.
//				if(map[i][j] == true) {
//					System.out.print("# ");
//				} else {
//					System.out.print(". ");
//				}
//			}
//			System.out.println();
//		}
		
		boolean[][] board = new boolean[10][10];
		
		//������ �߻��Ͽ� 30%Ȯ���� ���ڸ� �����Ѵ�.
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				if(Math.random() < 0.3) {
					board[i][j] = true;
				}
			}
		}
		
		//������ ���
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				if(board[i][j]) {
					System.out.print("# ");
				} else {
					System.out.print(". ");
				}
			}
			System.out.println();
		}
	}
}