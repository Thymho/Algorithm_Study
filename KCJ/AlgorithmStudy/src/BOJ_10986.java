import java.io.*;
import java.util.*;

public class BOJ_10986 {

	public static void main(String[] args) throws IOException{
		// TODO 백준 10986
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); //입력받을 숫자의 개수
		int M = Integer.parseInt(st.nextToken()); //나눌 수
		long[] sums = new long[N+1];
		long[] count = new long[1000];
		long answer = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<=N; i++) {
			sums[i] = sums[i-1] + Integer.parseInt(st.nextToken());
			int rem = (int) (sums[i]%M);
			
			if(rem == 0) {
				++answer;
			}
			
			++count[rem];
		}
		
		for(int i=0; i<count.length; i++) {
			if(count[i] > 1) {
				answer += count[i]*(count[i]-1)/2;
			}
		}
		
		System.out.println(answer);
	}
}