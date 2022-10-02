import java.util.*;
import java.io.*;

public class BOJ_2018_4 {
	public static void main(String[] args) throws IOException{
		// TODO น้มุ 2018น๘
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(st.nextToken());
		
		int start = 1, end = 1;
		int sum = 1;
		int answer = 0;
		
		while(start <= N) {
			if(sum == N) {
				++answer;
				++end;
				sum += end;
			} else if(sum < N) {
				++end;
				sum += end;
			} else {
				sum -= start;
				++start;
			}
		}
		
		bw.write(String.valueOf(answer));
		bw.flush();
	}
}