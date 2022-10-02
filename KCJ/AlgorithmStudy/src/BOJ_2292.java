import java.util.*;
import java.io.*;

public class BOJ_2292 {
	public static void main(String[] args) throws IOException{
		// TODO 단계별 문제풀이
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int count = 1, range = 2; //range = 입력받은 칸이 어디 범위에 속하는지, count = 최소 경로(ex. N=13, count = 3)
		
		if(N == 1) { //N이 1일 때에는 따로 예외처리를 해줘야 함.
			System.out.println(1);
		} else { //이 다음부터는 6씩 넓어지는 방의 개수에 맞춰 count를 곱해준다.
			while(range <= N) {
				range = range + (6 * count);
				++count;
			}
			System.out.println(count); //그렇게 늘어난 count를 출력해준다.
		}
	}
}