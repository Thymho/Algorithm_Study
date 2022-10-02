public class Question19 {
	public static void main(String[] args) {
		
		//게임판
		boolean[][] gameBoard = new boolean[10][10];
		
		//난수를 발생하여서 30% 확률로 지뢰를 저장한다.
		for(int i=0; i<gameBoard.length; i++) {
			for(int j =0; j<gameBoard[i].length; j++) {
				if(Math.random() < 0.3) {
					gameBoard[i][j] = true;
				}
			}
		}
		
		//게임판을 출력한다.
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