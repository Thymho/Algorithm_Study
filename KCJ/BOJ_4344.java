import java.util.*;
import java.io.*;

public class BOJ_4344 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int C = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<C; i++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int sum = 0, count = 0;
			int[] scores = new int[N];
			
			for(int j=0; j<N; j++) {
				scores[j] = Integer.parseInt(st.nextToken());
				sum += scores[j];
			}
			
			for(int j=0; j<N; j++) {
				if(scores[j] > sum/N) {
					++count;
				}
			}
			
			System.out.println(String.format("%.3f", ((double)count/N*100))+"%");
		}
	}
}