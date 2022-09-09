import java.io.*;
import java.util.*;

public class BOJ_11720 {

	public static void main(String[] args) throws IOException{
		//TODO น้มุ 11720
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		String nums_string = br.readLine();
		char[] nums_char = new char[N];
		int sum = 0;
		
		for(int i=0; i<nums_string.length(); i++) {
			nums_char[i] = nums_string.charAt(i);
			sum += nums_char[i]-'0';
		}
		
		System.out.println(sum);
	}
}