import java.util.*;
import java.io.*;

public class BOJ_1253_3 {
	public static void main(String[] args) throws IOException{
		// TODO ???? 1253??
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(st.nextToken());
		int[] nums = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(nums);
		
		int answer = 0;
		
		for(int i=0; i<N; i++) {
			int start = 0, end = N-1;
			int find = nums[i];
			
			while(start < end) {
				int sum = nums[start] + nums[end];
				
				if(sum == find) {
					if(start != i && end != i) {
						++answer;
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
		
		bw.write(String.valueOf(answer));
		bw.flush();
	}
}