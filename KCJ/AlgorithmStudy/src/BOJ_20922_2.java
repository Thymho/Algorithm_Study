import java.util.*;
import java.io.*;

public class BOJ_20922_2 {
	public static void main(String[] args) throws IOException{
		// TODO น้มุ 20922
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] nums = new int[N];
		int[] count = new int[100001];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		int start = 0, end = 0, answer = 0;
		while(start <= end) {
			if(end<=N-1 && count[nums[end]] < K) {
				++count[nums[end]];
				++end;
			} else if(count[nums[end]] == K) {
				--count[nums[start]];
				++start;
			}
			
			answer = Math.max(answer, end - start);
			if(end == N) {
				break;
			}
		}
		System.out.println(answer);
	}
}