import java.util.*;
import java.io.*;

public class BOJ_1316_3 {
	public static void main(String[] args) throws IOException{
		// TODO 단계별 문제 풀이
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int answer = N;
		
		for(int i=0; i<N; i++) { //문자열 반복문
			String str = br.readLine();
			boolean[] check = new boolean[26]; 
			
			for(int j=0; j<str.length()-1; j++) {
				if(str.charAt(j) != str.charAt(j+1)) {
					if(check[str.charAt(j+1)-'a'] == true) { //다음 글자가 전에 나왔던 글자인지 체크하는 가정문
						answer -= 1;
						break;
					}
				}
				check[str.charAt(j)-'a'] = true;
			}
		}
		
		System.out.println(answer);
	}
}
