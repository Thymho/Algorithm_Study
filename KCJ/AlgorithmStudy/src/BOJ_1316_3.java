import java.util.*;
import java.io.*;

public class BOJ_1316_3 {
	public static void main(String[] args) throws IOException{
		// TODO �ܰ躰 ���� Ǯ��
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int answer = N;
		
		for(int i=0; i<N; i++) { //���ڿ� �ݺ���
			String str = br.readLine();
			boolean[] check = new boolean[26]; 
			
			for(int j=0; j<str.length()-1; j++) {
				if(str.charAt(j) != str.charAt(j+1)) {
					if(check[str.charAt(j+1)-'a'] == true) { //���� ���ڰ� ���� ���Դ� �������� üũ�ϴ� ������
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
