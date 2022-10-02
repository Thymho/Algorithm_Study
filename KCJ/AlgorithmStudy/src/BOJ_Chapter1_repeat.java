import java.io.*;
import java.util.*;

public class BOJ_Chapter1_repeat {

	public static void main(String[] args) throws IOException{
		// TODO 백준 11720번
/*		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		String nums_string = br.readLine();
		char[] nums = new char[N];
		int sum = 0;
		
		for(int i=0; i<nums_string.length(); i++) {
			nums[i] = nums_string.charAt(i);
			sum += nums[i]-'0';
		}
		
		System.out.println(sum);
*/
		
		
		//TODO 백준 1546번
/*		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int[] scores = new int[N];
		int M = 0;
		double sum = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<scores.length; i++) {
			scores[i] = Integer.parseInt(st.nextToken());
			sum += scores[i];
			
			if(M < scores[i]) {
				M = scores[i];
			}
		}
		
		System.out.println((double) (sum*100/M/N));
*/
		
		
		//TODO 백준 11659번
/*		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		long[] sums = new long[N+1];
		
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<sums.length; i++) {
			sums[i] = sums[i-1] + Integer.parseInt(st.nextToken());
		}
		
		for(int k=0; k<M; k++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			
			System.out.println(sums[j] - sums[i-1]);
		}
*/
		
		
		//TODO 백준 11660번
/*		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] nums = new int[N+1][N+1];
		long[][] sums = new long[N+1][N+1];
		
		for(int i=1; i<=N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1; j<=N; j++) {
				nums[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				sums[i][j] = nums[i][j] + sums[i-1][j] + sums[i][j-1] - sums[i-1][j-1];
			}
		}
		
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			System.out.println(sums[x2][y2] - sums[x1-1][y2] - sums[x2][y1-1] + sums[x1-1][y1-1]);
		}
*/
		
		
		//TODO 백준 10986번
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		long[] sums = new long[N+1];
		long[] count = new long[1000];
		long answer = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<=N; i++) {
			sums[i] = sums[i-1] + Integer.parseInt(st.nextToken());
			int rem = (int) (sums[i]%M);
			
			if(rem == 0) {
				++answer;
			}
			
			++count[rem];
		}
		
		for(int i=0; i<count.length; i++) {
			if(count[i] > 1) {
				answer += count[i]*(count[i]-1)/2;
			}
		}
		
		System.out.println(answer);
	}
}
