public class Question20 {
	public static void main(String[] args) {
		
		boolean[][] gameBoard = new boolean[10][10];
		int x = 5, y = 5;
		int steps;
		gameBoard[x][y] = true;
		
		for(steps=0; steps<10; steps++) {
			int direction = (int) (Math.random()*4);
			if(direction == 0) {
				y++;
			} else if(direction == 1) {
				x++;
			} else if(direction == 2) {
				y--;
			} else {
				x--;
			}
			gameBoard[x][y] = true;
			
			System.out.println("-----------------------------------");
			for(int i=0; i<10; i++) {
				for(int j=0; j<10; j++) {
					if(gameBoard[i][j] == true) {
						System.out.print("#  ");
					} else {
						System.out.print(".  ");
					}
				}
				System.out.println();
			}
			System.out.println("-----------------------------------");
		}
		System.out.println("전체 이동 수는 = " + steps);
	}
}