import java.util.*;
import java.io.*;

public class BOJ_2467_4 {
	public static void main(String[] args) throws IOException{
		// TODO ���� 2467
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int[] nums = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		int start = 0, end = N-1, answer1 = 0, answer2 = 0;
		long min = Long.MAX_VALUE;
		
		while(start < end) {
			long sum = nums[start] + nums[end];
			long abs = Math.abs(sum);
			
			if(abs < min) {
				min = abs;
				answer1 = nums[start];
				answer2 = nums[end];
				
				if(sum == 0) {
					break;
				}
			}
			
			if(sum < 0) {
				++start;
			} else {
				--end;
			}
		}
		
		System.out.println(answer1+" "+answer2);
	}
}