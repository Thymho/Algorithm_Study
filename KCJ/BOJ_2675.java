import java.util.*;
import java.io.*;

public class BOJ_2675 {
	public static void main(String[] args) throws IOException{
		// TODO 단계별 풀기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<T; i++){
			st = new StringTokenizer(br.readLine());
			
			int R = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			String answer = "";
			
			for(int j=0; j<str.length(); j++) {
				char temp = str.charAt(j);
				for(int k=0; k<R; k++) {
					answer += temp;
				}
			}
			System.out.println(answer);
		}
	}
}