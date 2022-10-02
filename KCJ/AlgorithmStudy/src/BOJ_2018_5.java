import java.io.*;

public class BOJ_2018_5 {
	public static void main(String[] args) throws IOException{
		// TODO น้มุ 2018
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int start = 1, end = 1, sum = 1, answer = 1;
		
		while(start < N) {
			if(sum == N) {
				++answer;
				sum -= start;
				++start;
			} else if(sum < N) {
				++end;
				sum += end;
			} else {
				sum -= start;
				++start;
			}
		}
		
		System.out.println(answer);
	}
}