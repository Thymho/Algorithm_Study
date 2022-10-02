import java.io.*;
import java.util.*;

public class BOJ_1546_ver2 {

	public static void main(String[] args) throws IOException{
		// TODO น้มุ 1546
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int sum = 0, max = 0;
		int[] scores = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			scores[i] = Integer.parseInt(st.nextToken());
			sum += scores[i];
		}
		
		Arrays.sort(scores);
		max = scores[N-1];
		
		System.out.println((double)sum*100/max/N);
	}
}