import java.util.*;
import java.io.*;

public class BOJ_Chapter2_repeat {
	public static void main(String[] args) throws IOException{
		// TODO 백준 2018번 - 배열 버전
		
/*		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		int[] nums = new int[N];
		
		for(int i=0; i<N; i++) {
			nums[i] = i+1;
		}
		
		int start = 0, end = 0, answer = 1, sum = nums[0];
		
		while(start < N-1) {
			if(sum == N) {
				++answer;
				++end;
				sum += nums[end];
			} else if(sum < N) {
				++end;
				sum += nums[end];
			} else {
				sum -= nums[start];
				++start;
			}
		}
		
		System.out.println(answer);
*/
		
		// TODO 백준 2018번 - 배열X 버전
		
/*		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		int start = 1, end = 1, answer = 1, sum = 1;
		
		while(start < N-1) {
			if(sum == N) {
				++answer;
				++end;
				sum += end;
			} else if(sum < N) {
				++end;
				sum += end;
			} else {
				sum -= start;
				++start;
			}
		}
		
		System.out.println(answer);
*/
		
		// TODO 백준 1940번 - sort 버전
		
/*		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		
		int[] nums = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(nums);
		
		int start = 0, end = N-1, answer = 0;
		while(start < end) {
			int sum = nums[start] + nums[end];
			if(sum == M) {
				++answer;
				++start;
			} else if(sum < M) {
				++start;
			} else {
				--end;
			}
		}
		
		System.out.println(answer);
*/
		// TODO 백준 1940번 - sort X버전
		
/*		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		
		int[] nums = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) {
				if(nums[i] > nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		
		int start = 0, end = N-1, answer = 0;
		while(start < end) {
			int sum = nums[start] + nums[end];
			if(sum == M) {
				++answer;
				++start;
			} else if(sum < M) {
				++start;
			} else {
				--end;
			}
		}
		
		System.out.println(answer);
*/
		
		// TODO 백준 1253번 - sort 버전
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int[] nums = new int[N];
		int answer = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(nums);
		
		for(int i=0; i<N; i++) {
			int find = nums[i];
			int start = 0, end = N-1;
			
			while(start < end) {
				int sum = nums[start] + nums[end];
				if(sum == find) {
					if(start != i && end != i) {
						++answer;
						break;
					} else if(start == i) {
						++start;
					} else if(end == i) {
						--end;
					}
				} else if(sum < find) {
					++start;
				} else {
					--end;
				}
			}
		}
		
		System.out.println(answer);
	}
}