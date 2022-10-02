import java.util.*;
import java.io.*;

public class BOJ_10871 {
	public static void main(String[] args) throws IOException{
		// TODO 단계별 풀기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			if(num < X) {
				bw.write(String.valueOf(num)+" ");
			}
		}
		
		bw.flush();
	}
}