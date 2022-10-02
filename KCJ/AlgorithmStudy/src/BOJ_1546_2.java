import java.util.*;
import java.io.*;

public class BOJ_1546_2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int[] scores = new int[N];
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }
        
        int M = 0;
        int sum = 0;
        for(int i=0; i<N; i++) {
            sum += scores[i];
            
            if(M < scores[i]) {
                M = scores[i];
            }
        }
        
        System.out.println(((double)sum/M*100/N));
    }
}