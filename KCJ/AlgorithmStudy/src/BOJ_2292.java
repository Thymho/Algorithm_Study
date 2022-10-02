import java.util.*;
import java.io.*;

public class BOJ_2292 {
	public static void main(String[] args) throws IOException{
		// TODO �ܰ躰 ����Ǯ��
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int count = 1, range = 2; //range = �Է¹��� ĭ�� ��� ������ ���ϴ���, count = �ּ� ���(ex. N=13, count = 3)
		
		if(N == 1) { //N�� 1�� ������ ���� ����ó���� ����� ��.
			System.out.println(1);
		} else { //�� �������ʹ� 6�� �о����� ���� ������ ���� count�� �����ش�.
			while(range <= N) {
				range = range + (6 * count);
				++count;
			}
			System.out.println(count); //�׷��� �þ count�� ������ش�.
		}
	}
}