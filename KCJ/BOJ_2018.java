import java.io.*;
import java.util.*;

public class BOJ_2018 {

	public static void main(String[] args) throws IOException{
		// TODO 백준 2018번
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
//		long[] nums = new long[N];
//		long answer = 0;
		long answer = 1; //자기 자신
		
//		for(int i=1; i<N; i++) {
//			nums[i-1] = i;
//		}
		
//		int start = 0, end = 0;
//		long sum = 0;
		int start = 1, end = 1;
		long sum = 1;
		while(end != N) {
//			long sum =+ nums[start] + nums[end];
//			
//			if(sum == N) {
//				++answer;
//			} else if(sum < N) {
//				++end;
//			} else if(sum > N) {
//				++start;
//			}
			
			if(sum == N) {
				++answer;
				++end;
				sum += end;
			} else if(sum > N) {
				sum -= start;
				++start;
			} else {
				++end;
				sum += end;
			}
		}
		
		System.out.println(answer);
	}

}
