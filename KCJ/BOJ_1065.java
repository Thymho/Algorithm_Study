import java.util.*;
import java.io.*;

public class BOJ_1065 {
	
	static int answer = 0;
	
	public static void main(String[] args) throws IOException{
		// TODO ���� 1065 (�ܰ躰 Ǯ��)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		for(int i=1; i<=N; i++) {
			X(i);
		}
		
		System.out.println(answer);
	}
	
	static void X(int i) {
		
		if(i/10 == 0 || i/10 >= 1 && i/10 <= 9) {
			//1�� �ڸ�, 10�� �ڸ�
			++answer;
		} else if(i/100 >= 1 && i/100 <= 9) {
			//100�� �ڸ�
			if(i/100 - (i%100/10) == (i%100/10)-(i%100%10)) {
				++answer;
			}
		}
	}
}