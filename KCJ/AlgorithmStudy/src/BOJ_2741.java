import java.util.*;
import java.io.*;

public class BOJ_2741 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        
        for(int i=1; i<=N; i++) {
            System.out.println(i);
        }
    }
}