package secondRepeat;

public class randomWalk {

	public static void main(String[] args) {
		
		boolean[][] map = new boolean[10][10];
		int direction = 0, x = 5, y = 5;
		
		//���� �߽ɿ��� ����
		map[x][y] = true;
		
		//�ȴ� Ƚ��
		for(int walk=0; walk<10; walk++) {
			
			direction = (int)(Math.random()*4);
			
			//���� ����
			if(direction == 0) {
				--x;
			} else if(direction == 1) {
				++y;
			} else if(direction == 2) {
				++x;
			} else {
				--y;
			}
			
			map[x][y] = true;
			
			//�� �׸���
			System.out.println("------------------------------------");
			for(int i=0; i<map.length; i++) {
				for(int j=0; j<map[i].length; j++) {
					if(map[i][j]) {
						System.out.print("# ");
					} else {
						System.out.print(". ");
					}
				}
				System.out.println();
			}
			System.out.println("------------------------------------");
			
		}
	}
}