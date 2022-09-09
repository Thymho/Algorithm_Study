import java.io.*;
import java.util.*;

public class BOJ_11660 {

	public static void main(String[] args) throws IOException{
		// TODO 백준 11660
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] nums = new int[N+1][N+1];
		long[][] sums = new long[N+1][N+1];

		//숫자 입력받고 합 구하기
		for(int i=1; i<=N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1; j<=N; j++) {
				nums[i][j] = Integer.parseInt(st.nextToken());
				sums[i][j] += sums[i-1][j] + sums[i][j-1] - sums[i-1][j-1] + nums[i][j];
			}
		}
		
		//답 구하기
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			System.out.println(sums[x2][y2] - sums[x1-1][y2] - sums[x2][y1-1] + sums[x1-1][y1-1]);
		}
	}
}