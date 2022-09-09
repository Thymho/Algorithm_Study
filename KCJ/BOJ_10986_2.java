import java.io.*;
import java.util.*;

public class BOJ_10986_2 {

	public static void main(String[] args) throws IOException{
		// TODO น้มุ 10986น๘
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		long[] sums  = new long[N+1];
		long[] count = new long[1000];
		long answer = 0; 
		
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<=N; i++) {
			sums[i] = sums[i-1]+Integer.parseInt(st.nextToken());
			sums[i] %= M;
			int rem = (int) sums[i]%M;
			
			if(rem == 0) {
				++answer;
			}
			
			++count[rem];
		}
		
		for(int i=0; i<count.length; i++) {
//			if(count[i] > 1) {
//				answer = count[i]*(count[i]-1)/2;
//			}
			if(count[i] > 1) {
				answer += count[i]*(count[i]-1)/2;
			}
		}
		
		System.out.println(answer);
	}

}
