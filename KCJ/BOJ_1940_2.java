import java.util.*;
import java.io.*;

public class BOJ_1940_2 {

	public static void main(String[] args) throws IOException{
		// TODO น้มุ 1940น๘
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int[] nums = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(nums);
		
		int start = 0, end = N-1;
		int answer = 0;
		
		while(start < end) {
			int sum = nums[start] + nums[end];
			
			if(sum == M) {
				++answer;
				++start;
			} else if(sum < M) {
				++start;
			} else {
				--end;
			}
		}
		
		System.out.println(answer);
	}
}