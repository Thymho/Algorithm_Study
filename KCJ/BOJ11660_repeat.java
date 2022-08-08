import java.io.*;
import java.util.*;

public class BOJ11660_repeat {

	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		
//		int N = Integer.parseInt(st.nextToken());
//		int M = Integer.parseInt(st.nextToken());
//		long[][] sums = new long[N+1][N+1];
//		
//		for(int i=1; i<=N; i++) {
//			st = new StringTokenizer(br.readLine());
//			for(int j=1; j<=N; j++) {
//				long num = Integer.parseInt(st.nextToken());
//				sums[i][j] += sums[i-1][j] + num;
//			}
//		}
//		
//		for(int i=0; i<=N; i++) {
//			for(int j=0; j<=N; j++) {
//				System.out.print(sums[i][j]+" ");
//			}
//			System.out.println();
//		}
		
//		for(int i=0; i<M; i++) {
//			st = new StringTokenizer(br.readLine());
//			int x1 = Integer.parseInt(st.nextToken());
//			int y1 = Integer.parseInt(st.nextToken());
//			int x2 = Integer.parseInt(st.nextToken());
//			int y2 = Integer.parseInt(st.nextToken());
//			
//			bw.write(String.valueOf(sums[x2][y2] - sums[x1][y1-1])+"\n");
//			bw.flush();
//		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		long[][] sums = new long[N+1][N+1];
		int[][] nums = new int[N+1][N+1];
		
		for(int i=1; i<=N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1; j<=N; j++) {
				nums[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				sums[i][j] = sums[i][j-1] + sums[i-1][j] - sums[i-1][j-1] + nums[i][j]; 
			}
		}
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			bw.write(String.valueOf(sums[x2][y2] - sums[x1-1][y2] - sums[x2][y1-1] + sums[x1-1][y1-1])+"\n");
			bw.flush();
		}
	}

}
