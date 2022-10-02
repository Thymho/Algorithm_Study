import java.util.*;
import java.io.*;

public class BOJ_11720_2 {
	public static void main(String[] args) throws IOException{
		// TODO 단계별 풀이
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		char[] nums = new char[N];
		long sum = 0;
		
		String str = br.readLine();
		for(int i=0; i<N; i++) {
			nums[i] = str.charAt(i);
			sum += nums[i]-'0';
		}
		
		System.out.println(sum);
	}
}