public class Question19 {
	public static void main(String[] args) {
		
		//������
		boolean[][] gameBoard = new boolean[10][10];
		
		//������ �߻��Ͽ��� 30% Ȯ���� ���ڸ� �����Ѵ�.
		for(int i=0; i<gameBoard.length; i++) {
			for(int j =0; j<gameBoard[i].length; j++) {
				if(Math.random() < 0.3) {
					gameBoard[i][j] = true;
				}
			}
		}
		
		//�������� ����Ѵ�.
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				if(gameBoard[i][j]) {
					System.out.print("#  ");
				} else {
					System.out.print(".  ");
				}
			}
			System.out.println();
		}
		
	}
}