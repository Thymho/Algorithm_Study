import java.io.*;
import java.util.*;

public class BOJ_2908 {
	public static void main(String[] args) throws IOException{
		// TODO 단계별 풀이
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String A = st.nextToken(), B = st.nextToken(), answer = "";
		String num = "", num2 = "";
		
		for(int i=A.length()-1; i>-1; i--) {
			char tempA = A.charAt(i);
			char tempB = B.charAt(i);
			num += tempA;
			num2 += tempB;
		}
		
		if(Integer.parseInt(num) > Integer.parseInt(num2)) {
			System.out.println(num);
		} else {
			System.out.println(num2);
		}
	}
}