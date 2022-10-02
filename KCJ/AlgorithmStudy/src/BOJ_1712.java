import java.util.*;
import java.io.*;

public class BOJ_1712 {
	public static void main(String[] args) throws IOException{
		// TODO 단계별 풀이
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long A = Long.parseLong(st.nextToken()); //고정비용 - 회사 비용
		long B = Long.parseLong(st.nextToken()); //가변비용 - 노트북 비용
		long C = Long.parseLong(st.nextToken()); //수익 - 노트북 가격
		
		long count = 1; //노트북이 몇 대 팔렸는지 체크
		
		if(A < B || A >= B && B >= C) {
			count = -1;
		} else {
			count = A/(C-B)+1;
		}
		
		System.out.println(count);
	}
}