import java.util.*;
import java.io.*;

public class BOJ_20922_3 {
	public static void main(String[] args) throws IOException{
		// TODO 백준 20922 복습 3
		
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
		
		while(end < N) {
			++count[nums[end]];
			
			if(count[nums[end]] > K) {
				answer = end - start;
				break;
			} else {
				++end;
			}
		}
		
		System.out.println(answer);
	}
}