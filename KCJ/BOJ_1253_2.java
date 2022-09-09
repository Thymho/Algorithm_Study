import java.util.*;
import java.io.*;

public class BOJ_1253_2 {
	public static void main(String[] args) throws IOException{
		// TODO น้มุ 1253น๘
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int[] nums = new int[N];
		int answer = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(nums);
		
		for(int i=0; i<N; i++) {
			int start = 0, end = N-1;
			int find = nums[i];
			while(start < end) {
				int sum = nums[start] + nums[end];
				if(sum == find) {
					if(start != i && end != i) {
						++answer;
//						++start;
						break;
					} else if(start == i) {
						++start;
					} else if(end == i) {
						--end;
					}
				} else if(sum < find) {
					++start;
				} else {
					--end;
				}
			}
		}
		
		System.out.println(answer);
	}
}