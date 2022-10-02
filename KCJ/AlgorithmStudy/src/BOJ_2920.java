import java.util.*;
import java.io.*;

public class BOJ_2920 {
	public static void main(String[] args) throws IOException{
		// 클래스 밀기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] nums = new int[8];
		int asc_count = 0, des_count = 0;
		
		for(int i=0; i<8; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=1; i<8; i++) {
			if(nums[i-1]+1 <= nums[i]) {
				++asc_count;
			} else {
				++des_count;
			}
		}
		
		if(asc_count == 7) {
			System.out.println("ascending");
		} else if(des_count == 7) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
	}
}