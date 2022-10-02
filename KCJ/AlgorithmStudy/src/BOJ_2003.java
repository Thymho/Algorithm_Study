import java.io.*;
import java.util.*;

public class BOJ_2003 {

	public static void main(String[] args) throws IOException{
		// TODO น้มุ 2003น๘
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		long M = Integer.parseInt(st.nextToken());
		int[] nums = new int[N+1];
		long answer = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
//		int start = 0, end = 0;
//		while(end != N-1) {
//			long sum = nums[start]+nums[end];
//			if(sum == M) {
//				++answer;
//				++end;
//				sum += nums[end];
//			} else if(sum < M) {
//				sum -= nums[start];
//				++start;
//			} else {
//				++end;
//				sum += nums[end];
//			}
//		}
		
		int start = 0, end = 0;
		long sum = nums[0];
		
		while(end < N) {
			if(sum > M){
				sum -= nums[start];
				++start;
			}else if(sum < M) {
				++end;
				sum += nums[end];
			}else if(sum == M) {
				++answer;
				++end;
				sum += nums[end];
			}
		}
		
		if(N==1 && M==1) {
			System.out.println(1);
		}else {
			System.out.println(answer);
		}
	}
}