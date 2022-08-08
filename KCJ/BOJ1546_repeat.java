import java.io.*;
import java.util.*;

public class BOJ1546_repeat {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int[] nums = new int[N];
//		double avg = 0;
//		int max = 0, sum = 0;
		long max = 0, sum = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
			sum += nums[i];
		}
		
//		Arrays.sort(nums);
//		max = nums[N-1];
//		for(int i=1; i<N; i++) {
//			if(nums[i-1] > nums[i]) {
//				max = nums[i-1];
//			}
//		}
		for(int i=0; i<N; i++) {
			if(nums[i] > max) {
				max = nums[i];
			}
		}
		
//		bw.write(String.valueOf(sum*100/max/3));
		bw.write(String.valueOf(sum*100.0/max/N));
//		System.out.println((double)sum*100/max/3);
		bw.flush();
	}

}
