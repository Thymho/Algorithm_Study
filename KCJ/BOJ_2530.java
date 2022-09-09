import java.util.*;
import java.io.*;

public class BOJ_2530 {
	public static void main(String[] args) throws IOException{
		// TODO ���� 2530
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken()); //��
		int B = Integer.parseInt(st.nextToken()); //��
		int C = Integer.parseInt(st.nextToken()); //��
		
		st = new StringTokenizer(br.readLine());
		int D = Integer.parseInt(st.nextToken()); //�ɸ� �ð�(�ʴ���)
		
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