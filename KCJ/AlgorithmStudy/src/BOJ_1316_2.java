import java.util.*;
import java.io.*;

public class BOJ_1316_2 {
	public static void main(String[] args) throws IOException{
		// �ܰ躰 ���� Ǯ��
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int answer = N;
		
		for(int i=0; i<N; i++) { //�ܾ� �ݺ���
			String str = br.readLine();
			boolean[] check = new boolean[26]; //�ܾ�üũ�� ���ִ� �迭�� ���ڿ��� �Է� ���� �� ���� �ʱ�ȭ
			
			for(int j=0; j<str.length()-1; j++) { //�ܾ��� ���ڸ� üũ�ϴ� �ݺ���
				if(str.charAt(j) != str.charAt(j+1)) { //���� ���ڿ� ���� ���ڰ� ���� �ٸ� ��
					//check �迭�� �ش� �ε����� true ���� �ִٸ� > true ���� �ִٴ°� �̹� �� ���ڰ� �־��ٴ� ���̴�.
					if(check[str.charAt(j+1)-'a'] == true) {
						--answer; //�Է¹��� ���ڿ��� ������ �ٿ��ش�.
						break; //�ݺ����� �����ش� > �̹� ���ڵ��� üũ����� ������.
					}
				}
				check[str.charAt(j)-'a'] = true; //�ι�° for���� ��ġ�� ��� ���ڵ鿡 true�� �־��ش�. > �̴� �ι�° if������ ����ϰ� �ȴ�.
			}
		}
		System.out.println(answer); //���� ������ش�.
	}
}