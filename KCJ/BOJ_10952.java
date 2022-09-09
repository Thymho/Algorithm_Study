import java.util.*;
import java.io.*;

public class BOJ_10952 {
	public static void main(String[] args) throws IOException{
		// TODO 단계별 풀이
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s;
		int A = 0, B = 0;
		
		while((s=br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(s);
			
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			
			bw.write(String.valueOf(A+B)+'\n');
		}
		
		bw.flush();
	}
}