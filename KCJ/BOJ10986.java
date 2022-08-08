import java.io.*;
import java.util.*;

public class BOJ10986 {

	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		
//		int N = Integer.parseInt(st.nextToken());
//		int M = Integer.parseInt(st.nextToken());
//		int[] sums = new int[N+1];
//		int count = 0;
//		
//		st = new StringTokenizer(br.readLine());
//		for(int i=1; i<=N; i++) {
//			int num = Integer.parseInt(st.nextToken());
//			sums[i] += sums[i-1] + num;
//		}
//		
//		for(int i=1; i<=N; i++) {
//			for(int j=1; j<=N; j++) {
//				if(sums[i]+sums[j]) {
//					
//				}
//			}
//		}
//		
//		bw.write(String.valueOf(count));
//		bw.flush();
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		
//		int N = Integer.parseInt(st.nextToken());
//		int M = Integer.parseInt(st.nextToken());
//		long[] sums = new long[N+1];
//		long[] combi = new long[N+1];
//		int count = 0;
//		
//		st = new StringTokenizer(br.readLine());
//		for(int i=1; i<=N; i++) {
//			int num = Integer.parseInt(st.nextToken());
//			sums[i] += sums[i-1] + num;
//			sums[i] %= M;
//			
//			if(sums[i] == 0) {
//				++count;
//			}
//			
//			for(int j=0; j<=N; j++) {
//				if(sums[j] == 1) {
//					++combi[j];
//					break;
//				}
//			}
//		}
//		
//		for(int i=0; i<=N; i++) {
//			if(combi[i] == 1) {
//				count += combi[i]*(combi[i]-1)/2;
//			}
//		}
//		
//		bw.write(String.valueOf(count));
//		bw.flush();

//책에 있는 해답지
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		int M = sc.nextInt();
//		long[] sums = new long[N];
//		long[] combi = new long[N];
//		long count = 0;
//		
//		sums[0] = sc.nextLong();
//		for(int i=1; i<=N; i++) {
//			sums[i] = sums[i-1] + sc.nextInt();
//		}
//		
//		for(int i=0; i<N; i++) {
//			int rem = (int) sums[i]%M;
//			
//			if(rem == 0) {
//				++count;
//			}
//			
//			++combi[rem];
//		}
//		
//		for(int i=0; i<M; i++) {
//			if(combi[i] > 1) {
//				count += (combi[i]*(combi[i]-1)/2);
//			}
//		}
//		
//		System.out.println(count);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		long[] sums = new long[N+1];
		long[] combi = new long[1000];
		long count = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<N+1; i++) {
			int num = Integer.parseInt(st.nextToken());
			sums[i] = sums[i-1] + num;
			sums[i] %= M;
		}
		
		for(int i=1; i<=N; i++) {
			int rem = (int)sums[i]%M;
			
			if(rem == 0) {
				++count;
			}
			
			++combi[rem];
		}
		
		for(int i=0; i<combi.length; i++) {
			if(combi[i] > 1) {
//				count += (combi[i]*(combi[i]-1));
				count += combi[i] * (combi[i] - 1) / 2;
			}
		}
		
		bw.write(String.valueOf(count));
		bw.flush();
	}

}
