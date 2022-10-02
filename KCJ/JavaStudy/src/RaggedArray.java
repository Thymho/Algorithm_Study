public class RaggedArray {
	public static void main(String[] args) {
		
		final int MAX_ROWS = 5;
		
		//���� �����ϰ� �ִ� �迭
		int [][] ragged = new int[MAX_ROWS+1][];
		
		//�� ���� �����Ͽ� ragged[]�� �����Ѵ�.
		for(int r=0; r<=MAX_ROWS; r++) {
			ragged[r] = new int[r+1];
		}
		
		//2���� �迭�� �����Ǿ����Ƿ� ������ �����Ѵ�.
		for(int r=0; r<ragged.length; r++){
			for(int c=0; c<ragged[r].length; c++) {
				ragged[r][c] = c;
			}
		}
		
		//��¹�
		for(int r=0; r<ragged.length; r++) {
			for(int c=0; c<ragged[r].length; c++) {
				System.out.print(ragged[r][c]+" ");
			}
			System.out.println();
		}
	}
}