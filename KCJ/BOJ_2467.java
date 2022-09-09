import java.io.*;
import java.util.*;

public class BOJ_2467 {

	public static void main(String[] args) throws Exception{
		// TODO น้มุ 2467น๘

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		long[] nums = new long[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			nums[i] = Long.parseLong(st.nextToken());
		}
		
//		Long[] numsArrays = Arrays.stream(nums).boxed().toArray(Long[]::new);
//		
//		int count = 0;
//		for(int i=0; i<N; i++) {
//			if(nums[i] > 0) {
//				++count;
//			}
//		}
//		
//		if(count == N) {
//			Arrays.sort(nums);
//		} else if(count == 0) {
//			Arrays.sort(numsArrays, Collections.reverseOrder());
//		}
		
//		Arrays.sort(nums);
		
		int start = 0, end = N-1;
		long min = Long.MAX_VALUE;
		long ans1 = 0, ans2 = 0;
		
//		while(start < end) {
//			long sum = nums[start] + nums[end];
//			long abs = Math.abs(sum);
//			
//			if(abs < min) {
//				min = abs;
//				ans1 = nums[start];
//				ans2 = nums[end];
//				if(abs == 0) {
//					break;
//				}
//				--end;
//			} else if(abs > min) {
//				--end;
//			} else {
//				++start;
//			}
//		}
		
		Arrays.sort(nums);
		
		while(start < end) {
			long sum = nums[start] + nums[end];
			long abs = Math.abs(sum);
			
			if(abs < min) {
				min = abs;
				ans1 = nums[start];
				ans2 = nums[end];
				if(abs == 0) {
					break;
				}
			}
			
			if(sum > 0) {
				--end;
			} else {
				++start;
			}
			
		}
		
		System.out.println(ans1+" "+ans2);
	}

}
