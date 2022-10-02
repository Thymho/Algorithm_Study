public class RaggedArray {
	public static void main(String[] args) {
		
		final int MAX_ROWS = 5;
		
		//행을 저장하고 있는 배열
		int [][] ragged = new int[MAX_ROWS+1][];
		
		//각 행을 생성하여 ragged[]에 저장한다.
		for(int r=0; r<=MAX_ROWS; r++) {
			ragged[r] = new int[r+1];
		}
		
		//2차원 배열이 생성되었으므로 ㄱ밧을 저장한다.
		for(int r=0; r<ragged.length; r++){
			for(int c=0; c<ragged[r].length; c++) {
				ragged[r][c] = c;
			}
		}
		
		//출력문
		for(int r=0; r<ragged.length; r++) {
			for(int c=0; c<ragged[r].length; c++) {
				System.out.print(ragged[r][c]+" ");
			}
			System.out.println();
		}
	}
}