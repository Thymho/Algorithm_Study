import java.util.*;
import java.io.*;

public class BOJ_20922 {

	public static void main(String[] args) throws IOException{
		// TODO ���� 20922��
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] nums = new int[N];
		int[] count = new int[100001];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
//			++count[nums[i]];
		}
		
//		int j = 0;
//		for(int i=0; i<count.length; i++) {
//			if(count[i] > K) {
//				for(j=N-1; j>0; j--) {
//					if(i == nums[j]) {
//						break;
//					}
//				}
//			}
//		}
//		
//		if(j==0) {
//			System.out.println(N-1);
//		} else if(j != 0) {
//			System.out.println(j);
//		}
		
		int start = 0, end = 0;
		int answer = 0;
		//���� �����Ϳ� �� ������(�� ������)
		//answer�� ����
		
		//end�� 0�̹Ƿ� nums.length���� �۴ٰ� �ص� ������ �����ǹǷ� �ݺ����� ���ư�
		while(end < nums.length) {
			//nums.length���� end�� �۰� 
			while(end < nums.length && count[nums[end]] + 1 <= K) {
				++count[nums[end]];
				++end;
			}
			int len = end-start;
			answer = Math.max(answer, len);
			--count[nums[start]];
			++start;
		}
		
		System.out.println(answer);
		//�ù�...
	}
}
