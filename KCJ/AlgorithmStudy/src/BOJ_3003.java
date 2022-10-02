import java.util.*;
import java.io.*;

public class BOJ_3003 {
	public static void main(String[] args) throws IOException{
		// 단계별 문제
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] nums = new int[6];
		int[] answer = new int[6];
		
		for(int i=0; i<6; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<6; i++) {
			if(i==0 || i==1) {
				if(nums[i] == 0) {
					++answer[i];
				} else if(nums[i] > 1) {
					answer[i] -= nums[i] - 1;
				}
			} else if(i >= 2 && i <= 4) {
				if(nums[i] < 2) {
					answer[i] += 2-nums[i];
				} else if(nums[i] > 2) {
					answer[i] -= nums[i] - 2;
				}
			} else if(i == 5) {
				if(nums[i] < 8) {
					answer[i] += 8-nums[i];
				} else if(nums[i] > 8) {
					answer[i] -= nums[i] - 8;
				}
			}
		}
		
		for(int i=0; i<6; i++) {
			System.out.print(answer[i]+" ");
		}
	}
}