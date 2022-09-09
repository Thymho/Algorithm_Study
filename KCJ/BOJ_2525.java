import java.util.*;
import java.io.*;

public class BOJ_2525 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int C = Integer.parseInt(st.nextToken());
        
        if(C/60 > 0) {
            A += C/60;
        }
        
        B += C%60;
        
        if(B >= 60) {
        	A += B/60;
        	B = B-60;
        }
        
        if(A >= 24) {
    		A -= 24;
    	}
        
        System.out.println(A+" "+B);
    }
}