import java.util.*;
import java.io.*;

public class BOJ_2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        
        for(int i=1; i<10; i++){
            System.out.println(N+" * "+i+" = "+N*i);
        }
    }
}