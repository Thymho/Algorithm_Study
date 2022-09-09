import java.util.*;
import java.io.*;

public class BOJ_2018_2 {

	public static void main(String[] args) throws IOException{
		// TODO น้มุ 2018น๘
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int[] nums = new int[N+1];
		
		for(int i=0; i<=N; i++) {
			nums[i] = i;
		}
		
		int start = 0, end = 0;
		int sum = nums[0];
		int answer = 1;
		
		while(/*start < N*/ end <= N-1 ) {
			if(sum == N) {
				++answer;
				++end;
				sum += nums[end];
			} else if(sum < N) {
				++end;
				sum += nums[end];
			} else if(sum > N) {
				sum -= nums[start];
				++start;
//				sum += nums[start];
			}
		}
		
		System.out.println(answer);
	}
}