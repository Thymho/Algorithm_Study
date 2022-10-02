import java.util.*;
import java.io.*;

public class BOJ_1110 {
	public static void main(String[] args) throws IOException{
		// TODO 단계별 풀기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(st.nextToken());
		int sum = 0, count = 1, ten = N/10, one = N%10;
		
		while(true) {
			sum = ten + one;
			ten = one;
			one = sum%10;
			
			if((ten*10)+one == N) {
				break;
			}
			
			++count;
		}
		
		bw.write(String.valueOf(count));
		bw.flush();
	}
}