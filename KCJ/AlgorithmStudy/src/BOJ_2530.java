import java.util.*;
import java.io.*;

public class BOJ_2530 {
	public static void main(String[] args) throws IOException{
		// TODO 백준 2530
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken()); //시
		int B = Integer.parseInt(st.nextToken()); //분
		int C = Integer.parseInt(st.nextToken()); //초
		
		st = new StringTokenizer(br.readLine());
		int D = Integer.parseInt(st.nextToken()); //걸린 시간(초단위)
		
		C += D;
		
		if(C>= 60) {
			int sec = C%60;
			B += C/60;
			
			if(B>=60) {
				int min = B%60;
				A += B/60;
				
				if(A/24 > 0) {
					int rem = A%24;
					
					if(A/24 == 1 && rem >= 0) {
						A -= 24;
					} else {
						A = rem;
					}
				}
				
				B = min;
			}
			
			C = sec;
		}
		
		System.out.println(A+" "+B+" "+C);
	}
}