import java.util.*;
import java.io.*;

public class BOJ_1712 {
	public static void main(String[] args) throws IOException{
		// TODO �ܰ躰 Ǯ��
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long A = Long.parseLong(st.nextToken()); //������� - ȸ�� ���
		long B = Long.parseLong(st.nextToken()); //������� - ��Ʈ�� ���
		long C = Long.parseLong(st.nextToken()); //���� - ��Ʈ�� ����
		
		long count = 1; //��Ʈ���� �� �� �ȷȴ��� üũ
		
		if(A < B || A >= B && B >= C) {
			count = -1;
		} else {
			count = A/(C-B)+1;
		}
		
		System.out.println(count);
	}
}