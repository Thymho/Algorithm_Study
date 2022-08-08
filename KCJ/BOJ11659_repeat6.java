import java.io.*;
import java.util.*;

public class BOJ11659_repeat6 {

	public static void main(String[] args) throws IOException{
		// 백준 11659번 복습6
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		long[] sums = new long[N+1]; 
//		int[] nums = new int[N+1];
//		int[] sums = new int[N+1];
				
//		st = new StringTokenizer(br.readLine());
//		for(int i=1; i<=N; i++) {
//			nums[i] = Integer.parseInt(st.nextToken());
//		}
		
//		for(int i=1; i<=N; i++) {
//			sums[i] += sums[i-1]+nums[i];
//		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<=N; i++) {
			sums[i] += sums[i-1] + Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			
			int index1 = Integer.parseInt(st.nextToken());
			int index2 = Integer.parseInt(st.nextToken());
			
//			bw.write(String.valueOf(sums[index2] - sums[index1-1])+"\n");
//			System.out.println(sums[index2] - sums[index1-1]);
			bw.write(String.valueOf(sums[index2] - sums[index1-1])+"\n");
			bw.flush();
//			bw.close();
		}
	}

}
