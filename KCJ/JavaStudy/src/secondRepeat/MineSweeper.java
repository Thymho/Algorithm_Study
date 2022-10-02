package secondRepeat;

public class MineSweeper {
	public static void main(String[] args) {
//		boolean[][] map = new boolean[10][10];
//		
		//게임 맵 출력하기
//		for(int i=0; i<map.length; i++) {
//			for(int j=0; j<map[i].length; j++) {
		
				//1~10까지의 난수를 발생시킴.
//				int number = (int)(Math.random()*10)+1;
//				
				//30%의 확률로 지뢰를 심을 것이기 때문에 난수가 1~3이면 true로 바꿔준다.
//				if(number < 4) {
//					map[i][j] = true;
//				} else {
//					map[i][j] = false;
//				}
//				
				//이때 true면 #으로 지뢰가 있다는 것을 알려준다.
//				if(map[i][j] == true) {
//					System.out.print("# ");
//				} else {
//					System.out.print(". ");
//				}
//			}
//			System.out.println();
//		}
		
		boolean[][] board = new boolean[10][10];
		
		//난수를 발생하여 30%확률로 지뢰를 저장한다.
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				if(Math.random() < 0.3) {
					board[i][j] = true;
				}
			}
		}
		
		//게임판 출력
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