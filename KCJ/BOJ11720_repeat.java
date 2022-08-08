import java.io.*;
import java.util.*;

public class BOJ11720_repeat {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
//		int N = Integer.parseInt(st.nextToken());
//		int[] nums = new int[N];
//		int sum = 0;
//		
//		st = new StringTokenizer(br.readLine());
//		for(int i=0; i<N; i++) {
//			nums[i] = Integer.parseInt(st.nextToken());
//			sum += nums[i];
//		}
//		
//		bw.write(String.valueOf(sum));
//		bw.flush();
		
		int N = Integer.parseInt(st.nextToken());
		char[] nums = new char[N+1];
		int sum = 0;
		String nums_string = br.readLine();
		
		for(int i=1; i<=nums_string.length(); i++) {
			nums[i] = nums_string.charAt(i-1);
			sum += nums[i]-'0';
		}
		
		bw.write(String.valueOf(sum));
		bw.flush();
		
	}

}
