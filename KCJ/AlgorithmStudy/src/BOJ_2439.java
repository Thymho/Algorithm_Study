import java.util.*;
import java.io.*;

public class BOJ_2439 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        
        for(int i=0; i<N; i++) { //줄바꾸는 for
        	for(int k=N-1; k>i; k--) { //오른쪽으로 정렬시켜줄 for
        		System.out.print(" ");
        	}
            for(int j=0; j<i+1; j++) { //별찍는 for
                System.out.print("*");
            }
            System.out.println();
        }
    }
}